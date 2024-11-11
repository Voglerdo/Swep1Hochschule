package swep4a;

import uebungen3A.InputTools;

public class Quersumme {
	public static void main(String[] args) {
		System.out.println("Guten Tag!");
		System.out.println("Dieses Programm berechnet eine Quersumme");
		int zahl = InputTools.readInteger("Bitte Zahl 0..9999 ein:");
		int quersumme = 0;
		StringBuilder rechnung = new StringBuilder();

		while (zahl > 0) {
			int letzteZiffer = zahl % 10;
			quersumme += letzteZiffer;
			rechnung.insert(0, letzteZiffer);
			if (zahl >= 10) {
				rechnung.insert(0, " + ");
			}
			zahl /= 10;
		}
		
		System.out.println("Die Quersumme ist: " + rechnung + " = " + quersumme);
	}
}
