
import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String inputString, String trashSymbolString) {

		int i = 0;
		int j = inputString.length() - 1;
		char char1, char2;

		while (i <= j) {

			// get a character from begin
			char1 = inputString.charAt(i);
			// get a character from end
			char2 = inputString.charAt(j);

			// ignore trash symbols
			while (trashSymbolString.indexOf(char1) != -1) {
				char1 = inputString.charAt(i++);
			}
			while (trashSymbolString.indexOf(char2) != -1) {
				char2 = inputString.charAt(j--);
			}

			// if characters are not equal, return false
			if (char1 != char2) {
				return false;
			}

			// otherwise move to next comparison
			i++;
			j--;
		}

		// if all are matched, return true
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// scan
		String inputString = scanner.nextLine();
		String trashSymbolString = scanner.nextLine();

		// find
		boolean result = isPalindrome(inputString, trashSymbolString);

		// print
		System.out.println("Result : " + result);
	}

}
