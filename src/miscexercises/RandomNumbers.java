package miscexercises;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		double result = approximatePi(n);
		System.out.println(result);
	}

	public static double approximatePi(int n) {
		int mone = 0;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			double x = r.nextDouble();
			double y = r.nextDouble();
			if (y * y + x * x <= 1)
				mone++;
		}
		return mone * 4.0 / n;
	}

}
