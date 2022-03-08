package Hafta_3;

import java.util.Scanner;

public class Alistirma_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int dizi1[] = new int[10];
		int dizi2[] = new int[10];

		System.out.print("10 adet sayi girin: ");
		for (int i = 0; i < dizi1.length; i++) {
			dizi1[i] = input.nextInt();
		}
		System.out.print("10 adet sayi girin: ");
		for (int j = 0; j < dizi2.length; j++) {
			dizi2[j] = input.nextInt();
		}

		for (int x = 0; x < dizi1.length; x++) {
			for (int y = 0; y < dizi2.length; y++) {
				if (dizi1[x] == dizi2[y]) {
					System.out.print(dizi1[x] + " ");
				}
			}
		}
		input.close();
	}

}
