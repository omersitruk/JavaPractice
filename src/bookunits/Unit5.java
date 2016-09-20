package bookunits;

import java.util.Scanner;

public class Unit5 {

	public static void main(String[] args) {
		ex13();

	}

	public static void ex7() {
		Scanner in = new Scanner(System.in);
		int numchild = in.nextInt();
		int numsit = in.nextInt();
		in.close();

		int numship = calcShips(numchild, numsit);

		System.out.println(numship);

	}

	public static int calcShips(int numchild, int numsit) {
		int numship = numchild / numsit;
		int restnum = numchild % numsit;
		if (restnum > 0)
			numship += 1;
		return numship;
	}

	public static void ex13() {
		Scanner in = new Scanner(System.in);
		int firstgrade = in.nextInt();
		int secondgrade = in.nextInt();
		in.close();
		int counter = highGrades(firstgrade, secondgrade);
		System.out.println(counter);

	}

	public static int highGrades(int firstgrade, int secondgrade) {
		int counter = 0;
		if (firstgrade > 80)
			counter++;
		if (secondgrade > 80)
			counter++;
		return counter;
	}
}
