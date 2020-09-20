import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Please enter your height and weight: "); 
		String text = buf.readLine(); 
		String[] data = text.split(" ");
		double res = getBMI(data);
		String dia = getDiagnosis(res);
		System.out.println(dia + " BMI: " + res); 
               
	}
	
	public static double getBMI(String[] data) {
		// calculate the bmi
		return 0;
	}
	
	public static String getDiagnosis(double bmi) {
		// give comments depending on bmi
        return "";
	}
}
