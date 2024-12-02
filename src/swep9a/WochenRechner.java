package swep9a;

import uebungen3A.InputTools;

public class WochenRechner {
		public static void main(String[] args) {
			int tag = InputTools.readInteger("Tag eingeben: ");
			int monat = InputTools.readInteger("Monatszahl eingeben: ");
			int jahr = InputTools.readInteger("Jahr eingeben: ");
			
			if (checkDate(tag, monat, jahr)) {
			
				int startwert = ((jahr - 1900)*365)+tag;
				startwert += (jahr-1900)/4;
				
				if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
				    if (monat <= 2) {
				        startwert--;
				    }
				}
				startwert += gibTageMonat(monat);
				
				int wochentag = startwert % 7;
				String wochentagString;
				
				switch (wochentag) {
				case 0: wochentagString = "Sonntag"; break;
				case 1: wochentagString = "Montag"; break;
				case 2: wochentagString = "Dienstag"; break;
				case 3: wochentagString = "Mittwoch"; break;
				case 4: wochentagString = "Donnerstag"; break;
				case 5: wochentagString = "Freitag"; break;
				case 6: wochentagString = "Samstag"; break;

				default: wochentagString = "Fehler";
					break;
				}
				
				System.out.println(wochentagString);
				
			}
			
		}
		
		public static int gibTageMonat(int monat) {
		    
		    int[] tageProMonat = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		    int tage = 0;
		    for (int i = 1; i < monat; i++) {
		        tage += tageProMonat[i];
		    }
		    return tage;
		}
		
		public static boolean checkDate (int tag, int monat, int jahr) {
			if ((monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) && tag > 0 & tag <=31) {
				return true;
			}
			else if (monat == 2 && tag > 0 & tag <=29) {
				return true;
			}
			else if ((monat == 4 || monat == 6 || monat == 9 || monat == 11) && tag > 0 & tag <=30) {
				return true;
			}
			else if (monat == 2 && tag > 0 && ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0) ? tag <= 29 : tag <= 28)) {
			    return true;
			}
			else {
				return false;
			}
		}
	}