import java.util.Scanner;

public class Al�st�rma_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir say� girin: ");
		int N = input.nextInt();
		int result = 0;
		for (int i = 1; i < N; i++) {
			result += i;
		}
		System.out.println("Toplam = " + result);
		input.close();
	}

}
