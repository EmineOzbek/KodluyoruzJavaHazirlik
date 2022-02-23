package Hafta_2;

import java.util.Random;

public class Alistirma_6 {

	public static void main(String[] args) {

		Random r = new Random();
		int cift = 0;
		int tek = 0;

		for (int i = 0; i < 10; i++) {
			int x = r.nextInt();

			if (x % 2 == 0) {
				cift++;
			} else {
				tek++;
			}
		}
		System.out.println("Tek sayı: " + tek);
		System.out.println("Cift sayı: " + cift);
	}
}
