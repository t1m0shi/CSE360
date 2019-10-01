/*
 * Name: Kendall Timothy
 * ID: 1202169440
 * Class ID: CSE 360
 * Assignment: 1
 * Description: a string is entered and isPalindrome checks if that string is a palindrome. isPalindrome uses the checkValidChar method to make sure
 * 				that the current character in the string is an alphanumeric character, and if not, it moves the index to the next character.
 */

package assign1;

/**
 * Palindrome class takes in a string and can check whether or not it is a palindrome defined as a word or phrase consisting of 0 or more 
 * alphanumeric characters that reads the same frontwards and backwards while ignoring cases, punctuation and white space.
 * @author Kendall Timothy
 * @version 1.0
 */
public class Palindrome {
	private String testString;
	
	/**
	 * Constructs a Palindrome object that is simply a string to be tested
	 * @param testing string that will be tested as a palindrome
	 */
	public Palindrome(String testing) {
		testString = testing;
	}
	
	/**
	 * Checks if the palindrome's test string is a palindrome.
	 * @return returns true if the Palindrome's string is in fact a palindrome, the length is 0, or all characters are not alphanumeric;
	 *  returns false otherwise;
	 */
	public boolean isPalindrome() {
		boolean test = true;
		int length = testString.length();
		int begins = 0;
		int ends = length-1;
		if(length == 0) {
			return test;
		}
		else {
			//checks from each end towards the middle to see if the characters read the same, ignores mid char if odd length since it will be same
			while(begins < ends && test == true) {
				//calls checkValidChar to make sure the current character is alphanumeric, if not it will move the index until it is
				begins = checkValidChar(testString, begins, true);
				ends = checkValidChar(testString, ends, false);
				if(Character.toLowerCase(testString.charAt(begins)) != Character.toLowerCase(testString.charAt(ends))) {
					test = false;
				}
				begins++;
				ends--;
			}
		}
		return test;
	}
	
	/**
	 * Checks if a character at position index is an alphanumeric character or not and moves the index to the next valid character
	 * (this method is called by the isPalindrome() method)
	 * @param checking the string to be checked from
	 * @param index position we're checking at in the string
	 * @param isBegin whether we're checking from the beginning or the end of the string which determines the direction the index is shifted
	 * @return returns an integer of the index of the next alphanumeric character
	 */
	public int checkValidChar(String checking, int index, boolean isBegin) {
		char temp1 = checking.charAt(index);
		int ans = index;
		try {
			if(!((temp1 >= 48 && temp1 <=57) || (temp1 >= 65 && temp1 <= 90) || (temp1 >= 97 && temp1 <= 122))) {//if not 0-9, A-Z, a-z
				if(isBegin) {
					ans++;
					ans = checkValidChar(checking, ans, isBegin);
				}
				else {
					ans--;
					ans = checkValidChar(checking, ans, isBegin);
				}
			}
		//if there's no AN chars, then it will go out of bounds, then we can just compare the last char to itself which will return true
		} catch(IndexOutOfBoundsException ex) {
			ans = checking.length()-1;
		}
		return ans;
	}
}
