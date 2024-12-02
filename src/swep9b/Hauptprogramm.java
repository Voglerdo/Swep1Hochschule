package swep9b;

public class Hauptprogramm {
    public static void main(String[] args) {

    	IWert kontoInterface;
    	IWert goldInterface;
    	
        kontoInterface = new Konto(1000);
        goldInterface = new Gold(1000);
        
        System.out.println("Kontostand: " + kontoInterface.gibWert());
        System.out.println("Goldgewicht: " + goldInterface.gibWert());
    }
}
