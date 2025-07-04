import java.util.Scanner;

public class Reverse_Num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int reverse = getReverse(N);
        System.out.println(+reverse);
    }

    public static int getReverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }
}
