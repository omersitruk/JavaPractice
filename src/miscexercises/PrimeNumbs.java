package miscexercises;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a bound: ");
		int bound = scanner.nextInt();
		boolean[] isPrime = new boolean[bound]; // Defining a new boolean array
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int p = 2; p < isPrime.length; p++) {
			if (isPrime[p]) {
				for (int n = 2 * p; n < isPrime.length; n += p) {
					isPrime[n] = false;
				}
			}
		}

		for (int i = 0; i < bound; i++) {
			if (isPrime[i])
				System.out.println(i);
		}

		scanner.close();
	}
	
	public static void mainImproved(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a bound: ");
		int bound = scanner.nextInt();
		boolean[] isPrime = new boolean[bound]; // Defining a new boolean array
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int p = 2; p < isPrime.length; p++) {
			if (!isPrime[p]) {
				continue;
			}
			for (int n = 2 * p; n < isPrime.length; n += p) {
				isPrime[n] = false;
			}
		}

		for (int i = 0; i < bound; i++) {
			if (isPrime[i])
				System.out.println(i);
		}

		scanner.close();
	}

}
