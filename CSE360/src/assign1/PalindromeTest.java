/*Name: Kendall Timothy
 * ID: 1202169440
 * Class ID: CSE 360
 * Assignment: 1
 * Description: Test cases showing that isPalendrome() works correctly and to spec.
 */

package assign1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	//make sure it can instantiate a Palindrome object
	public void testPalindrome() {
		Palindrome testy = new Palindrome("test");
		assertNotNull(testy);
	}
	
	@Test
	//checks that a basic case that does not follow the definition fails
	public void testIsNotPalindrome() {
		Palindrome testy = new Palindrome("test");
		assertFalse(testy.isPalindrome());
	}

	@Test
	//checks that a basic case that follows the definition passes
	public void testIsPalindrome() {
		Palindrome testy = new Palindrome("1racecar1");
		assertTrue(testy.isPalindrome());
	}
	
	@Test
	//makes sure casing is ignored as well
	public void testCasing() {
		Palindrome testy = new Palindrome("1RaCecAr1");
		assertTrue(testy.isPalindrome());
	}
	
	@Test
	//makes sure punctuation is ignored correctly
	public void testPunctuation() {
		Palindrome testy = new Palindrome(".#$derongi ti si is it ignored?");
		assertTrue(testy.isPalindrome());
	}
	
	@Test
	//should be true if length is 0 since "no alphanumeric characters"
	public void ifEmpty() {
		Palindrome testy = new Palindrome("");
		assertTrue(testy.isPalindrome());
	}
	
	@Test
	//should be true if all characters are non-alphanumeric ("no alphanumeric characters")
	public void noAlphaNumeric() {
		Palindrome testy = new Palindrome("#$.");
		assertTrue(testy.isPalindrome());
	}
	
	@Test
	//checks the boundaries of checking a valid character and ignoring non-alphanumeric
	public void oneLetter() {
		Palindrome testy = new Palindrome("a#$");
		assertTrue(testy.isPalindrome());
	}
}
