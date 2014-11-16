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

}
