public class APIMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Absolute value of x. */
	public static int abs(int x) {
		if (x < 0)
			return -x;
		else
			return x;
	}

	/* Primality test. Check if a number is prime or not. */
	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		// it makes no sense to go beyond i*i < x
		// e.g.: x = 9. Of course all the number > 3 are not good.
		for (int i = 2; i * i < x; i++)
			if (x % i == 0)
				return false;
		return true;
	}

	// reverse element within an array
	public static void reverseArray(int[] array) {
		int length = array.length;
		for (int i = 0; i < length / 2; i++) {
			int temp = array[i];
			array[i] = array[length - 1 - i];
			array[length - 1 - i] = temp;
		}
	}

	public static void squareMatrixMultiply(int[][] first, int[][] second) {
		final int size = 4;
		first = new int[size][size];
		second = new int[size][size];
		int[][] result = new int[size][size];

		// scan lines of first matrix
		for (int i = 0; i < size; i++) {
			// scan lines of second matrix
			for (int j = 0; j < size; j++) {
				// scan columns of second matrix
				for (int k = 0; k < size; k++) {
					// multiply all the elements in first matrix line
					// with the correspondent element in second matrix column
					// In first matrix keep the line fixed
					// while in the second matrix keep the column fixed
					result[i][j] += first[i][k] * second[k][j];
				}
			}
		}
	}

	// check whether an array is alphabetically sorted
	public static boolean isSorted(String[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1].compareTo(array[i]) > 0) {
				return false;
			}
		}
		return true;
	}
}
