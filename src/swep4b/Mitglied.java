package swep4b;

public class Mitglied {

	private String name;
    private String vorname;
    private int mitgliedernummer;
    private Adresse adresse;
    
	public Mitglied() {
		super();
	}

	public Mitglied(String name, String vorname, int mitgliedernummer, Adresse adresse) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.mitgliedernummer = mitgliedernummer;
		this.adresse = adresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getMitgliedernummer() {
		return mitgliedernummer;
	}
	public void setMitgliedernummer(int mitgliedernummer) {
		this.mitgliedernummer = mitgliedernummer;
	}
	
    @Override
	public String toString() {
		return "Mitglied [name=" + name + ", vorname=" + vorname + ", mitgliedernummer=" + mitgliedernummer
				+ ", adresse=" + adresse + "]";
	}
}
