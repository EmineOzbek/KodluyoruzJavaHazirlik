import java.util.Scanner;

public class Alistirma_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Birinci say�y� girin: ");
		double x = input.nextDouble();
		System.out.print("�kinci say�y� girin: ");
		double y = input.nextDouble();
		double result = x * y;
		System.out.print("�arp�m sonucu: " + result);
		input.close();
	}

}
