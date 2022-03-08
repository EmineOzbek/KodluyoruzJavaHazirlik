package Hafta_3;

import java.util.Scanner;

public class Alistirma_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int x = input.nextInt();

		int fact = 1;
		while (x > 0) {
			fact = fact * x;
			x--;
		}
		System.out.print(fact);
		input.close();
	}
}
