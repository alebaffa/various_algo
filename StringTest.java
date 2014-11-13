import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringTest {

	public static void main(String[] args) {
		System.out.println(checkCount("123"));
		int[] array = new int[] { 1, 8, 1, 1, 8, 1, 1, 8, 1, 1 }; // 1, 4, 7
		System.out.println(randomPosition(array));
	}

	/**
	 * Given a mapping of alphabets to integers as follows:
	 * 
	 * 1 = A 
	 * 2 = B 
	 * 3 = C ... 
	 * 26 = Z
	 * 
	 * Given any combination of the mapping numbers as string, return the number
	 * of ways in which the input string can be split into sub-strings and
	 * represented as character strings. 
	 * For e.g. given "111" -> "AAA", "AK", "KA" -> 3 Valid combinations are ({1,1,1}, {1,11},{11,1}) = 3 
	 * "11" -> "AA", "K" -> 2 Valid combinations are ({1,1},{11}) = 2 
	 * "123" -> "ABC", "LC", "AW" -> 3 Valid combinations are ({1,2,3},{1,23},{12,3}) = 3
	 * 
	 * You don't have to return all the mappings, only the number of valid
	 * mappings.
	 * */
	public static int checkCount(String string) {
		int count = 0;
		if (Integer.parseInt(string) < 27)
			count = 1;
		for (int i = 1; i < string.length(); i++) {
			count = count + checkCount(string.substring(i, string.length()));
		}

		return count;
	}

	/**
	 * Given an array of integers. 
	 * We have to find the max element of the array, which is at multiple 
	 * places in the array and return any one of the indices randomly.
	 * */
	public static int randomPosition(int[] array) {
		int max = 0;
		List<Integer> positionsMax = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				positionsMax = new ArrayList<Integer>();
				positionsMax.add(i);
				System.out.println("new max found: " + max + " in position "
						+ i);
			} else {
				if (array[i] == max) {
					System.out.println("another max in position " + i);
					positionsMax.add(i);
				}
			}

		}
		Random random = new Random();
		return positionsMax.get(random.nextInt(positionsMax.size() + 1));
	}
}
