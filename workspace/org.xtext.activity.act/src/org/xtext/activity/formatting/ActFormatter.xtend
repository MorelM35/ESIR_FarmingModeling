/*
 * generated by Xtext
 */
package org.xtext.activity.formatting

import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.xtext.activity.services.ActGrammarAccess

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ActFormatter extends AbstractDeclarativeFormatter {
	
	@Inject extension ActGrammarAccess
	
	override protected configureFormatting(FormattingConfig c) {
		for(pair: findKeywordPairs('{', '}')) {
			c.setIndentation(pair.first, pair.second)
			c.setLinewrap(1).after(pair.first)
			c.setLinewrap(1).before(pair.second)
			c.setLinewrap(1).after(pair.second)
		}
		for(comma: findKeywords(',')) {
			c.setNoLinewrap().before(comma)
			c.setNoSpace().before(comma)
			c.setLinewrap().after(comma)
		}
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
}
