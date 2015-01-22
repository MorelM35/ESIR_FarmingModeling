package action;

import activity.PeriodicActivity;

public abstract class Action {
	protected PeriodicActivity _activity;
	
	protected Action(PeriodicActivity activity) {
		_activity=activity;
	}
	
	public PeriodicActivity getActivity(){
		return _activity;
	}
}
