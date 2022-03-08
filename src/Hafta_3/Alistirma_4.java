package Hafta_3;

import java.util.Scanner;

public class Alistirma_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir ifade girin: ");
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
			}
		}
		input.close();
	}
}
