public class BinaryTree {

	public static int search(int value, int[] range) {
		// lo and hi, will change dynamically every time the method is called
		int lo = 0; // set the lowest bound of the search
		int hi = range.length - 1; // set the highest bound of the search

		int mid = lo + (hi - lo) / 2;
		while (lo <= hi) {
			if (value < range[mid])
				hi = mid - 1;
			if (value > range[mid])
				lo = mid + 1;
			else
				return mid;
		}
		// return -1 in case the value is not found
		return -1;
	}

}
