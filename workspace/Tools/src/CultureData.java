

public class CultureData {
	/**
	 * STATIC FINAL CULTURE
	 */
	//TODO : see later in order to get this data from a file
	public static final CultureData MAIS = new CultureData(1.85, 0.94, 0.5, 5, 900, 0.0065, 0.00205);
	public static final CultureData BLE  = new CultureData(1.85, 0.94, 0.5, 6.5, 900, 0.0065, 0.00205);
	public static final CultureData SORGHO  = new CultureData(1.85, 0.94, 0.5, 4.5, 900, 0.0065, 0.00205);
	
	
	double Eb;
	double Eimax;
	double K;
	double LMax;
	double TI;
	double A;
	double B;
	
	public CultureData(double Eb, double Eimax, double K, double LMax, double Ti, double A, double B) {
		this.Eb=Eb;
		this.Eimax=Eimax;
		this.K=K;
		this.LMax=LMax;
		this.TI=Ti;
		this.A=A;
		this.B=B;
	}

	public double getEb() {
		return Eb;
	}

	public double getEimax() {
		return Eimax;
	}

	public double getK() {
		return K;
	}

	public double getLMax() {
		return LMax;
	}

	public double getTI() {
		return TI;
	}

	public double getA() {
		return A;
	}

	public double getB() {
		return B;
	}
	
	
}
