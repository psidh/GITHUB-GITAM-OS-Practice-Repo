// medium-level
package Java;
import java.util.Scanner;

class Palindrome {
    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome t = new Palindrome();
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean result = t.isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
}

//try doing it in some other way