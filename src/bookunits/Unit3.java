package bookunits;
import java.util.Scanner;

public class Unit3 {
	public static void main(String[] args) {
		ex1();

	}

	public static void ex1() {

		Scanner in = new Scanner(System.in);
		double f = in.nextDouble();
		double c = 5.0 / 9.0 * (f - 32);

		System.out.println(c);
		in.close();
	}

	public static void ex2() {
		Scanner in = new Scanner(System.in);
		double zela1 = in.nextDouble();
		double zela2 = in.nextDouble();
		double yeter = Math.sqrt(zela1 * zela1 + zela2 * zela2);
		double ekef = yeter + zela1 + zela2;
		double shetah = zela1 * zela2 / 2;
		System.out.println(ekef);
		System.out.println(shetah);
		in.close();
	}
}