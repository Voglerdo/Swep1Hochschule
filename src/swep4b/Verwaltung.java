package swep4b;

public class Verwaltung {
	public static void	main (String[] args) {
		
	Adresse adresse = new Adresse();
	Mitglied mitglied = new Mitglied();
	Adresse adresse2 = new Adresse("Altschauerberg", "8a", "91448", "Emskirchen");
	
	Mitglied mitglied2 = new Mitglied("Winkler", "Rudi", 21614, adresse2);
	
	adresse.setStrasse("Altschauerberg");
	adresse.setHausnummer("8");
	adresse.setOrt("Emskirchen");
	adresse.setPlz("91448");
	
	mitglied.setName("Winkler");
	mitglied.setVorname("Rainer");
	mitglied.setMitgliedernummer(187);
	mitglied.setAdresse(adresse);
	
	System.out.println(mitglied);
	System.out.println(mitglied2);
	
}
}