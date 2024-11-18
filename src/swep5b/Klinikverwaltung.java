package swep5b;

import swep4b.Adresse;
import uebungen3A.InputTools;

public class Klinikverwaltung {
	public static void main(String[] args) {
	//5.2
	 Adresse adr = new Adresse(); 
	 adr.setOrt("Kempten");
	 adr.setStrasse("Robert-Weixler Straße");
	 adr.setPlz("87435");
	 adr.setHausnummer("40");
	 Klinik k = new Klinik(); 
	 k.setName("Klinikum Kempten");
	 k.setAnzahlBetten(510);
	 k.setBesitztNotaufnahme(true);
	 k.setAdr(adr);
	 System.out.println(k);
	
	// 5.3 
	String strasse = InputTools.readString("geben Sie den Straßennamen an");
	String hausnummer = InputTools.readString("geben Sie die Hausnummer an");
	String plz = InputTools.readString("geben Sie die plz an");
	String ort = InputTools.readString("geben Sie den Ort an");
	Adresse adr2 = new Adresse(strasse, hausnummer, plz, ort);
	
	String nameKlinik = InputTools.readString("geben Sie den Klinikname an");
	int bettenAnzahl = InputTools.readInteger("geben Sie die Anzahl der Betten an");
	String notaufnahmeAntwort = InputTools.readString("Besitzt die Klinik eine Notaufnahme? (ja/nein): ");
    boolean besitztNotaufnahme = notaufnahmeAntwort.equals("ja");
    
    Klinik klinik = new Klinik(bettenAnzahl,besitztNotaufnahme,adr2,nameKlinik);
	System.out.println(klinik);
	}	
}