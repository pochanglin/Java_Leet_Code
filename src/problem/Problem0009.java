package problem;

/**
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * Coud you solve it without converting the integer to a string?
 * */
public class Problem0009 {

	public static void main(String[] args) {
		
		System.out.println(new Problem0009().isPalindrome(-121));
	}
	
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		String s2 = "";
		for(int i = s.length()-1; i >= 0; i--)
			s2 += s.charAt(i);
        return s.equals(s2);
    }

}
