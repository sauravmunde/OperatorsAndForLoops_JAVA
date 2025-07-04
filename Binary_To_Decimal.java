/*Problem statement
Given a binary number as an integer N, convert it into decimal and print.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int decimal = convertBinaryToDecimal(N);
        System.out.println(+decimal);
    }
    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;

 */

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int decimal = convertBinaryToDecimal(N);
        System.out.println(+decimal);
    }

    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            binary /= 10;
            decimal += lastDigit * base;
            base *= 2;
        }
        return decimal;
    }
}
