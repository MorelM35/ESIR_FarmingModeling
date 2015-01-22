import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.xml.crypto.Data;

public class Calculator {	
	
	public static Map<Date, WeatherData> series;
	
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
		double PAR = series.get(dday).getPAR();
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
		double tmp = series.get(dday).getTM();
		return eveValue+tmp; 
	}
	
	public static Map<Date, WeatherData> CSVParser(String fileToParse){
        //Input file which needs to be parsed
        //String fileToParse = "series.csv";
        BufferedReader fileReader = null;
         
        //Delimiter used in CSV file
        final String DELIMITER = ";";
        Map<Date, WeatherData> m = new HashMap<Date, WeatherData>();
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
            //Read the file line by line
            LinkedList<String> detect = new LinkedList<String>();
            detect.add("0");detect.add("1");detect.add("2"); detect.add("3");detect.add("4"); 
            detect.add("5");detect.add("6"); detect.add("7");detect.add("8"); detect.add("9");            
            
            while ((line = fileReader.readLine()) != null){
                String[] tokens = line.split(DELIMITER);
                if(tokens.length>0 && detect.contains(Character.toString((tokens[0].charAt(0))))){                	
                	Calendar calendar = Calendar.getInstance();
                	calendar.clear();
                	calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(tokens[3]));
                	calendar.set(Calendar.MONTH, Integer.parseInt(tokens[2]));
                	calendar.set(Calendar.YEAR, Integer.parseInt(tokens[1]));
                	Date date = calendar.getTime();
                	WeatherData wd = new WeatherData(Float.parseFloat(tokens[4]), Float.parseFloat(tokens[5]), Float.parseFloat(tokens[6]), Float.parseFloat(tokens[7]));                	
                	m.put(date, wd);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return m;
	}
	
}
