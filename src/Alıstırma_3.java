import java.util.Scanner;

public class Alýstýrma_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayýyý girin: ");
		double x = input.nextDouble();
		System.out.print("Ýkinci sayýyý girin: ");
		double y = input.nextDouble();
		double result = x * y;
		System.out.print("Çarpým sonucu: " + result);
		input.close();
	}

}
