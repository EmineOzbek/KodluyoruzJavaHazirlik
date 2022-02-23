package Hafta_2;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Kelime sayisi girin: ");
		int num = input.nextInt();
		
		System.out.println("Kelimeleri girin: ");
		String[] arr = new String[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		input.close();
	}

}
