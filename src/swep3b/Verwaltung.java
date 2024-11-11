package swep3b;


public class Verwaltung {
    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter();
        m.setName("Mustermann");
        m.setVorname("Max");
        m.setPersonalnr(123);
        System.out.println(m);
    }
}