import java.util.Scanner;

public class Alistirma_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("�ki say� girin: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.println("--De�i�imden �nce--");
		System.out.println("Birinci say�: " + x);
		System.out.println("�kinci say�: " + y);

		double temp = x;
		x = y;
		y = temp;
		System.out.println("--De�i�imden sonra--");
		System.out.println("Birinci say�: " + x);
		System.out.println("�kinci say�: " + y);
		input.close();
	}

}
