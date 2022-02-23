package Hafta_1;
import java.util.Scanner;

public class Alistirma_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ýki sayý girin: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.println("--Deðiþimden önce--");
		System.out.println("Birinci sayý: " + x);
		System.out.println("Ýkinci sayý: " + y);

		double temp = x;
		x = y;
		y = temp;
		System.out.println("--Deðiþimden sonra--");
		System.out.println("Birinci sayý: " + x);
		System.out.println("Ýkinci sayý: " + y);
		input.close();
	}

}
