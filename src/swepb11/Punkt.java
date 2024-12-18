package swepb11;

public class Punkt {
	double x;
	double y; 
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double abstandZu(Punkt b) {
		  return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
	}
	
	public String toString() {
		return "("+x+"|"+y+ ")";
	}
}
