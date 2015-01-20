import java.lang.Math;
import java.util.Date;

import javax.xml.crypto.Data;

public class Calculator {	
	
	/**
	 * CALCUL DE L'INDEX de la SURFACE FOLIAIRE
	 */
	public static double calculateLAI(Date dday, double STeveValue, double LMax, double A, double Ti, double B){
		double e1 = 1/(Math.exp(-A*(calculateSt(STeveValue,dday)-Ti))+1);
		double e2 = Math.exp(B*(calculateSt(STeveValue,dday)-calculateTr(A, B, Ti)));
		return LMax*(e1-e2);
	}
	
	public static double calculateLAI(Date dday,double STeveValue, CultureData culture){
		return calculateLAI(dday, STeveValue, culture.getLMax(), culture.getA(), culture.getTI(), culture.getB());
	}
	
	/**
	 * CALCUL DE LA BIOMASS
	 */
	
	public static double calculateBiomass(double eveValue, Date dday, double eB, double eImax, double K, double LAI){
		double PAR = 0; // TODO : get from parser
		return eveValue+(eImax*(1-Math.exp(-K*LAI))*eB*PAR);
	}
	
	public static double calculateBiomass(double eveValue, Date dday, CultureData culture){
		return calculateBiomass(eveValue, dday, culture.getEb(),culture.getEimax(),culture.getK(),calculateLAI(dday,eveValue, culture));
	}
	
	/**
	 * CALCUL INTERMEDIAIRE
	 */
	public static double calculateTr(double A, double B, double Ti){
		return (1/B)*Math.log(1+Math.exp(A*Ti));
	}
	
	public static double calculateTr(CultureData culture){
		return calculateTr(culture.getA(),culture.getB(),culture.getTI());
	}
	
	
	public static double calculateSt(double eveValue,Date dday){
		// TODO : get from the Kevin parser
		double tmp = 0;
		return eveValue+tmp; 
	}
}
