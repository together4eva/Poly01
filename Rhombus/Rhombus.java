
public class Rhombus {

	public static void main(String[] args) {
		int i, j, k;
		for (i = 1; i <= 4; i++) {
			for (j = 0; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 3; i > 0; i--) {

			for (j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
