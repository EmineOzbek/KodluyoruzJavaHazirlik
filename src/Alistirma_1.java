import java.util.Scanner;

public class Alistirma_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir say� girin: ");
		int x = input.nextInt();
		System.out.println("Girilen say�: " + x);
		input.close();
	}

}
