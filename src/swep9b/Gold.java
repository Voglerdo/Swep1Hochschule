package swep9b;
import java.util.Random;
public class Gold implements IWert{
	
	private int menge; 
	
	public Gold(int menge) {
		super();
		this.menge = menge;
	}

	public int gibWert() {
		Random random = new Random();
		int wert = 30 + random.nextInt(75 - 30 + 1);
		wert = menge*wert;
		return wert;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	@Override
	public String toString() {
		return "Gold [menge=" + menge + "]";
	}
	
}
