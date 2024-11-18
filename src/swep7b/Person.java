package swep7b;
import java.time.Month;

public class Person {
    private String vorname;
    private int geburtsTag;
    private int geburtsMonat;
    private int geburtsjahr;
    private boolean istKonsistent = true;

    public Person(String vorname, int geburtsTag, int geburtsMonat, int geburtsjahr) {
        super();
        this.vorname = vorname;
        setGeburtsTag(geburtsTag); 
        setGeburtsMonat(geburtsMonat);  
        this.geburtsjahr = geburtsjahr;
    }

    public static String getMonthName(int month) {
        return Month.of(month).name();
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
        int maxTage;

        switch (geburtsMonat) {
            case 2:
                maxTage = 28; 
                break;
            case 4: case 6: case 9: case 11:
                maxTage = 30;
                break;
            default:
                maxTage = 31;
        }

        if (geburtsTag > maxTage || geburtsTag < 1) {
            this.istKonsistent = false; 
        } else {
            this.geburtsTag = geburtsTag;
        }
    }

    public int getGeburtsMonat() {
        return geburtsMonat;
    }

    public void setGeburtsMonat(int geburtsMonat) {
        if (geburtsMonat < 1 || geburtsMonat > 12) {
            this.istKonsistent = false;  
        } else {
            this.geburtsMonat = geburtsMonat;
        }
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public boolean isIstKonsistent() {
        return istKonsistent;
    }

    public void setIstKonsistent(boolean istKonsistent) {
        this.istKonsistent = istKonsistent;
    }
}
