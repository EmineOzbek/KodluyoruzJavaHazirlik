package Hafta_2;

import java.util.Scanner;

public class Alistirma_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi girin: ");
		int N = input.nextInt();
		
		for (int i = 1; i < N; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		input.close();
	}
}
