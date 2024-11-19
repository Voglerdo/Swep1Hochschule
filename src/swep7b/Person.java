package swep7b;

class Person {
    private String name;
    private String vorname;
    private int geburtsTag;
    private int geburtsMonat;
    private int geburtsJahr;
    private boolean konsistent;

    private static final String[] monatsnamen = {
        "Januar", "Februar", "März", "April", "Mai", "Juni", 
        "Juli", "August", "September", "Oktober", "November", "Dezember"
    };

    public Person() {
        this.konsistent = true;
    }

    public Person(String name, String vorname, int geburtsTag, int geburtsMonat, int geburtsJahr) {
    	this.konsistent = true;
        setName(name);
        setVorname(vorname);
        setGeburtsTag(geburtsTag);
        setGeburtsMonat(geburtsMonat);
        setGeburtsJahr(geburtsJahr);
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburtsTag(int tag) {
        switch(geburtsMonat) {
            case 2: // Februar
                if (tag < 1 || tag > 28) {
                    konsistent = false;
                    return;
                }
                break;
            case 4: // April
            case 6: // Juni
            case 9: // September
            case 11: // November
                if (tag < 1 || tag > 30) {
                    konsistent = false;
                    return;
                }
                break;
            default: // Monate mit 31 Tagen
                if (tag < 1 || tag > 31) {
                    konsistent = false;
                    return;
                }
        }
        this.geburtsTag = tag;
    }

    public void setGeburtsMonat(int monat) {
        if (monat < 1 || monat > 12) {
            konsistent = false;
            return;
        }
        this.geburtsMonat = monat;
    }


    public void setGeburtsJahr(int geburtsJahr) {
        this.geburtsJahr = geburtsJahr;
    }

    public String getName() { return name; }
    public String getVorname() { return vorname; }
    public int getGeburtsTag() { return geburtsTag; }
    public int getGeburtsMonat() { return geburtsMonat; }
    public int getGeburtsJahr() { return geburtsJahr; }
    public boolean isKonsistent() { return konsistent; }

    public String toString() {
        return vorname + " " + name + ", geboren am " + 
               geburtsTag + ". " + monatsnamen[geburtsMonat-1] + " " + geburtsJahr;
    }

    public int alter(int tag, int monat, int jahr) {
        int alter = jahr - geburtsJahr;
        if (monat < geburtsMonat || 
            (monat == geburtsMonat && tag < geburtsTag)) {
            alter--;
        }
        
        return alter;
    }
}
