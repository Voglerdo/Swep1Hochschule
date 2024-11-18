package swep6a;

import uebungen3A.InputTools;

public class TemperaturRechner {
	public static void main(String args[]) {
	String umrechnungsWeg = InputTools.readString("Umrechnungsrichtung");
	
	if(umrechnungsWeg.equals("1")){
		umrechnungsWeg= "Celsius zu Fahrenheit";
	}
	else {
		umrechnungsWeg= "Fahrenheit zu Celsius";
	}
	
	double input = InputTools.readDouble(umrechnungsWeg);
	
	if (umrechnungsWeg.equals("Celsius zu Fahrenheit")) {
		 double fahrenheit = (9.0 / 5.0) * input + 32;
         System.out.printf("%.2f°C entsprechen %.2f°F%n", input, fahrenheit);
	}
	else {
		double celsius = (input - 32) * 5.0 / 9.0;
        System.out.printf("%.2f°F entsprechen %.2f°C%n", input, celsius);
	}
	}
}