package Hafta_3;

import java.util.Scanner;

public class Alistirma_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int x = input.nextInt();

		int y = 1;
		int result = 1;

		while (y <= 10) {
			result = y * x;
			System.out.println(x + " * " + y + " = " + result);
			y++;
		}
		input.close();
	}

}
