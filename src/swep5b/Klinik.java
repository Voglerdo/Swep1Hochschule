package swep5b;

import swep4b.Adresse;

public class Klinik {

	int anzahlBetten;
	boolean besitztNotaufnahme;
	Adresse adr ;
	String name; 
	
	public Klinik() {
		super();
	}
	
	public Klinik(int anzahlBetten, boolean besitztNotaufnahme, Adresse adr, String name) {
		super();
		this.anzahlBetten = anzahlBetten;
		this.besitztNotaufnahme = besitztNotaufnahme;
		this.adr = adr;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAnzahlBetten() {
		return anzahlBetten;
	}
	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}
	public boolean isBesitztNotaufnahme() {
		return besitztNotaufnahme;
	}
	public void setBesitztNotaufnahme(boolean besitztNotaufnahme) {
		this.besitztNotaufnahme = besitztNotaufnahme;
	}
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	
	@Override
	public String toString() {
		return "Klinik [anzahlBetten=" + anzahlBetten + ", besitztNotaufnahme=" + besitztNotaufnahme + ", adr=" + adr
				+ ", name=" + name + "]";
	}
}
