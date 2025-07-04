import java.util.Scanner;

public class Test_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean isArithmeticProgression = true;
        int commonDifference = numbers[1] - numbers[0];

        for (int i = 2; i < n; i++) {
            if (numbers[i] - numbers[i - 1] != commonDifference) {
                isArithmeticProgression = false;
                break;
            }
        }
        System.out.println("Is the given sequence an arithmetic progression? " + isArithmeticProgression);
    }
}
