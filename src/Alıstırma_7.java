import java.util.Scanner;

public class Al�st�rma_7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir say� girin: ");
		int x = input.nextInt();
		int result = 0;

		while (x > 0) {
			result += x % 10;
			x /= 10;
		}
		System.out.println("Basamak toplam�: " + result);
		input.close();
	}

}
