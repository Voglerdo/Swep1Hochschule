package swepb11;

public class HauptprogrammPunkt {
	 public static void main(String[] args) {
	        Punkt p1 = new Punkt(2, 3);
	        Punkt p2 = new Punkt(5, 7);

	        double abstand = p1.abstandZu(p2);
	        System.out.println("Der euklidische Abstand beträgt: " + abstand);
	    }
}
