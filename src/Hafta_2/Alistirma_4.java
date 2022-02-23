package Hafta_2;

import java.util.Scanner;

public class Alistirma_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir metin yazýnýz: ");
		String text = input.nextLine();

		for (int i = 0; i < text.length(); i++) {
			char[] vowel = { 'a', 'e', 'ý', 'i', 'u', 'ü', 'o', 'ö' };
			for (int j = 0; j < 8; j++) {

				if (text.charAt(i) == vowel[j]) {
					System.out.println(i + ". index: " + String.valueOf(text.charAt(i)));
				}
			}
		}
		input.close();
	}
}
