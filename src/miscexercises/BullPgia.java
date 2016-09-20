package miscexercises;
import java.util.Scanner;

public class BullPgia {

	public static void main(String[] args) {
		System.out.println("Please input 4 numbers from 0 to 7");
		Scanner scanner = new Scanner(System.in);
		int[] list = inputList(scanner);
		int bull = 0, pgia = 0;
		while (bull < list.length) {
			System.out.println("Please guess 4 numbers from 0 to 7");
			int[] guess = inputList(scanner);
			bull = 0;
			pgia = 0;
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < guess.length; j++) {
					if (list[i] == guess[j]) {
						if (i == j)
							bull++;
						else
							pgia++;

					}
				}
			}
			System.out.println("You have " + bull + " bull and " + pgia + " pgia ");
		}
		System.out.println("Success!!!");

		scanner.close();
	}

	private static int[] inputList(Scanner scanner) {
		int[] list = new int[4];
		for (int i = 0; i < list.length; i++) {
			list[i] = scanner.nextInt();
		}
		return list;
	}

}
