package Hafta_2;

import java.util.Scanner;

public class Alistirma_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("10 adet sayý giriniz:");
		int[] x = new int[10];
		int sum = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
			sum += x[i];
		}
		System.out.println("Toplam = " + sum);
		input.close();
	}

}
