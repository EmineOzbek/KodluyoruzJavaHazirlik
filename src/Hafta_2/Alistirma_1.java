package Hafta_2;

public class Alistirma_1 {

	public static void main(String[] args) {

		for (int i = 2; i < 1000000; i++) {

			int result = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					result++;
				}
			}
			if (result == 0) {
				System.out.println(i);
			}

		}
	}
}