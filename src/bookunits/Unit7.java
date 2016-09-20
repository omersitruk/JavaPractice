package bookunits;

import java.util.Scanner;

public class Unit7 {

	public static void main(String[] args) {
		ex4AndHalf();
	}

	public static void ex4() {
		Scanner in = new Scanner(System.in);
		String ladder = in.next();
		in.close();

		for (int i = 1; i <= 50; i++) {
			System.out.print(ladder);
		}

	}

	public static void ex4_improved() {
		Scanner in = new Scanner(System.in);
		String ladder = in.next();
		in.close();
		String result = repeat50(ladder);
		System.out.println(result);

	}

	public static String repeat50(String ladder) {
		String result = "";
		for (int i = 1; i <= 50; i++) {
			result += ladder;
		}
		return result;
	}

	public static void ex4AndHalf() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int sum = digitSum(num);
		System.out.println(sum);
	}

	public static int digitSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
