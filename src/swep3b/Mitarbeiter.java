package swep3b;

public class Mitarbeiter {
    private String name;
    private String vorname;
    private int personalnr;

    public int getPersonalnr() {
        return personalnr;
    }

    public void setPersonalnr(int personalnr) {
        this.personalnr = personalnr;
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

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "vorname='" + vorname + '\'' +
                ", name='" + name + '\'' +
                ", personalnr=" + personalnr +
                '}';
    }
}