package swep7b;
import java.time.Month;

public class Person {
	private String vorname;
	private int geburtsTag;
	private int geburtsMonat;
	private int geburtsjahr;
	public static boolean istKonsistent;
	
	public Person(String vorname, int geburtsTag, int geburtsMonat, int geburtsjahr) {
		super();
		this.vorname = vorname;
		this.geburtsTag = geburtsTag;
		this.geburtsMonat = geburtsMonat;
		this.geburtsjahr = geburtsjahr;
	}
	
    public static String getMonthName(int month) {
        try {
            // Verwende die `Month`-Enum, um den Monatsnamen zu holen
            return Month.of(month).name();
        } catch (Exception e) {
            return "Ungültiger Monat";
        }
    }
	
	public Person() {
		super();
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getGeburtsTag() {
		return geburtsTag;
	}
	public void setGeburtsTag(int geburtsTag) {
		this.geburtsTag = geburtsTag;
	}
	public int getGeburtsMonat() {
		return geburtsMonat;
	}
	public void setGeburtsMonat(int geburtsMonat) {
		this.geburtsMonat = geburtsMonat;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	

	
}
