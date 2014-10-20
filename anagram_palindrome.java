import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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