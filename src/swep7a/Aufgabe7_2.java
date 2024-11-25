package swep7a;

public class Aufgabe7_2 {
	// 7.2
	public static void main(String[] args) {

		System.out.println("a | b | c | r");
		System.out.println("------------");
		for (int a = 0; a <= 1; a++) {
			for (int b = 0; b <= 1; b++) {
				for (int c = 0; c <= 1; c++) {
					int r = (a & b) | c;
					System.out.printf("%d | %d | %d | %d%n", a, b, c, r);
				}
			}
		}
	}
}