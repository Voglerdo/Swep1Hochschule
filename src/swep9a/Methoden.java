package swep9a;

import uebungen3A.InputTools;

public class Methoden {
	public static void main(String args[]) {
	 int a = InputTools.readInteger("1");
     int b = InputTools.readInteger("2");
	 int c = InputTools.readInteger("3");
     int d = InputTools.readInteger("4");
     int e = InputTools.readInteger("5");
     
     int erg = groesereZalhFinden(a,b);
     erg = groesereZalhFinden(erg,d);
     erg = groesereZalhFinden(erg,c);
     System.out.println("erg"+ erg);
     
     // aufgabe 3 
     int[] zahlenArray = {a, b, c, d, e};
     System.out.println("Maximalwert (Array): " + findeMaxArray(zahlenArray));
     System.out.println("Maximalwert (3 Zahlen): " + findeMax(a, b, c));
     System.out.println("Maximalwert (alle 5 Zahlen): " + findeMax(a, b, c, d, e));

 }

     public static int groesereZalhFinden(int a, int b) {
    	 int groeser = a;
    	 if(a<b) groeser = b;
    	 return groeser;
     }    
     
     public static int findeMaxArray(int[] zahlenArray) {
    	 int erg= 0; 
    	 
    	 for (int i = 0; i<zahlenArray.length; i++) {
    	 if (erg < zahlenArray[i]) erg = zahlenArray[i];
    	 }
    	 
    	 return erg; 
     }
     
     public static int findeMax(int... zahlen) {
         int max = 0; 
         for (int zahl : zahlen) {
             if (zahl > max) {
                 max = zahl;
             }
         }
         return max;
     }
}