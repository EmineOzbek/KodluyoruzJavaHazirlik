import java.util.Scanner;

public class Alýstýrma_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Ýki sayý girin: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("Sayýlar: " + x + " " + y);
		int sum = x + y;
		System.out.println("Toplam: " + sum);
		input.close();

	}

}
