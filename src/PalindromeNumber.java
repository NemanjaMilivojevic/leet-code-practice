import com.sun.jdi.Value;

public class PalindromeNumber {
    //https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {

        System.out.println(isPalindrome(123321));
    }

    private static boolean isPalindrome(int x) {
        String numberToString = "";
        boolean result = false;
        String number = String.valueOf(x);
        for(int i = number.length() - 1; i >= 0; i --){
            numberToString += number.charAt(i);
        }
        if(numberToString.equals(String.valueOf(x)))
            result = true;
        return result;
    }
}
