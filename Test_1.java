/*
 
Problem statement
Check whether a given number ’n’ is a palindrome number.

Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.
Example:
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1032
Sample Output 1 :
false
Explanation Of Sample Input 1:
1032, on being reversed, gives 2301, which is a totally different number.
Sample Input 2 :
121
Sample Output 2 :
true
Explanation Of Sample Input 2:
121, on being reversed, gives 121, which is the same.
Expected time complexity:
The expected time complexity is O(log(n)).
Constraints :
1 <= n <= 10^9
Time Limit: 1 sec


 */

public class Test_1 {
    public static boolean palindromeNumber(int n) {
        // Convert negative numbers to positive for simplicity
        if (n < 0) {
            n = Math.abs(n);
        }

        int originalNumber = n;
        int reversedHalf = 0;

        while (n > reversedHalf) {
            int digit = n % 10;
            reversedHalf = reversedHalf * 10 + digit;
            n /= 10;
        }

        // If the length of the number is odd, remove the middle digit
        return n == reversedHalf || n == reversedHalf / 10;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 121;
        if (palindromeNumber(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
