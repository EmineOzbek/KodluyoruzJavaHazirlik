package Hafta_1;
import java.util.Scanner;

public class Alistirma_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayý girin: ");
		int x = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			int result = x * i;
			System.out.println(x + " * " + i + " = " + result);
		}
		input.close();

	}

}
