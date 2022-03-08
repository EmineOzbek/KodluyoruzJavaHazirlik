package Hafta_3;

import java.util.Scanner;

public class Alistirma_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int x = input.nextInt();

		if (x % 10 > 1) {
			System.out.println(x + " binary sayi değildir.");
		} else
			System.out.println(x + " binary sayidir.");

		input.close();
	}
}
