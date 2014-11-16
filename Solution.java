import java.util.Scanner;

/**
The king wants to lock the door so that the Dothraki can't enter. But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out if any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string

Constraints 
1<=length of string <= 10^5 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.

Sample Input : 01

aaabbbb
Sample Output : 01

YES
Explanation 
A palindrome permutation of the given string is bbaaabb. 

Sample Input : 02

cdefghmnopqrstuvw
Sample Output : 02

NO
Explanation 
You can verify that the given string has no palindrome permutation. 

Sample Input : 03

cdcdcdcdeeeef
Sample Output : 03

YES
Explanation 
A palindrome permutation of the given string is ddcceefeeccdd .


**/

public class Solution {

public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        int length = inputString.length();
		// Assign ans a value of YES or NO, depending on whether or not
		// inputString satisfies the required condition
		int[] frequency = new int[256];
		int doubleCount = 0;
		for (int i = 0; i <= length - 1; i++) {
			frequency[inputString.charAt(i)]++;
			if (frequency[inputString.charAt(i)] % 2 == 0)
				doubleCount++;
		}

		if (doubleCount == length / 2) ans = "YES";

		else if (doubleCount == (length / 2 - 1)) ans = "YES";
        else ans = "NO";

		System.out.println(ans);
		myScan.close();
	}
}