import java.util.Scanner;

public class Alistirma_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�ki say� girin: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("Say�lar: " + x + " " + y);
		int sum = x + y;
		System.out.println("Toplam: " + sum);
		input.close();

	}

}
