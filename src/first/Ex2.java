package first;

public class Ex2 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 5; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j < i+1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		for (int i = 1; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
