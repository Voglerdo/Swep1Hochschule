package swepb10;

public class Pruefung {
	private String lehrveranstaltung; 
	private int creditpoints;
	private float note;
	private static int anzahlInstanzenPruefung;
	
	
	public Pruefung() {
		super();
		anzahlInstanzenPruefung ++;
	}
	public Pruefung(String lehrveranstaltung, int creditpoints, float note) {
		super();
		this.lehrveranstaltung = lehrveranstaltung;
		this.creditpoints = creditpoints;
		this.note = note;
		anzahlInstanzenPruefung ++;
	}
	
	public static int getAnzahlInstanzenPruefung() {
		return anzahlInstanzenPruefung;
	}
	public static void setAnzahlInstanzenPruefung(int anzahlInstanzenPruefung) {
		Pruefung.anzahlInstanzenPruefung = anzahlInstanzenPruefung;
	}
	public String getLehrveranstaltung() {
		return lehrveranstaltung;
	}
	public void setLehrveranstaltung(String lehrveranstaltung) {
		this.lehrveranstaltung = lehrveranstaltung;
	}
	public int getCreditpoints() {
		return creditpoints;
	}
	public void setCreditpoints(int creditpoints) {
		this.creditpoints = creditpoints;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "Pruefung [lehrveranstaltung=" + lehrveranstaltung + ", creditpoints=" + creditpoints + ", note=" + note
				+ "]";
	} 
	
}
