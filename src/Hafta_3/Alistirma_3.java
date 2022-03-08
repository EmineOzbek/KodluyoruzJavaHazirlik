package Hafta_3;

import java.util.Scanner;

public class Alistirma_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int x = input.nextInt();

		int result;
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");

		while (x > 0) {
			result = a + b;
			System.out.print(result + " ");
			x--;
			a = b;
			b = result;
		}
		input.close();
	}
}