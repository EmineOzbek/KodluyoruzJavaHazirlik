package Hafta_2;

import java.util.Scanner;

public class Alistirma_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir metin girin: ");
		String text = input.nextLine();
		
		System.out.println("Tekrar sayýsý girin: ");
		int x = input.nextInt();
		
		for (int i = 0; i < x; i++) {
			System.out.println(text);
		}
		input.close();
	}
}
