package miscexercises;

public class Sorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void maxSort(int[] array) {
		for (int j = array.length - 1; j > 0; j--) {
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] < array[i - 1]) {
					int max = array[i - 1];
					array[i - 1] = array[i];
					array[i] = max;
				}
			}
		}
	}
}
