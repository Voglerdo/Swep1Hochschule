package swepb11;

public class Kleines1x1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i += 1) {
			for (int ii = i; ii <= i * 10; ii += i) {
				if (ii == 100) {
					System.out.print(" " + ii);
				} else {
					if (ii < 10) {
						System.out.print("   " + ii);
					} else {
						System.out.print("  " + ii);
					}
				}
			}
			System.out.print("\n");
		}
	}
}