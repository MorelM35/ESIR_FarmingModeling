
public class WeatherData {

	private float etp;
	private float rr;
	private float tm;
	private float par;

	public WeatherData(float etp, float rr, float tm, float par){
		this.etp 	= etp;
		this.rr 	= rr;
		this.tm 	= tm;
		this.par 	= par;
	}

	public float getETP() {
		return etp;
	}

	public float getRR() {
		return rr;
	}

	public float getTM() {
		return tm;
	}

	public float getPAR() {
		return par;
	}
	
}
