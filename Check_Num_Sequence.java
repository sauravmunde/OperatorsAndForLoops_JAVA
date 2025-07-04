import java.util.Scanner;

public class Check_Num_Sequence {
    public static boolean isStrictlyDecreasingThenIncreasing(int[] S) {
        int n = S.length;
        boolean decreasing = true;
        boolean increasing = false;

        for (int i = 1; i < n; i++) {
            if (S[i] > S[i - 1]) {
                decreasing = false;
                increasing = true;
            }
            if (increasing && S[i] < S[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }
        boolean result = isStrictlyDecreasingThenIncreasing(sequence);
        System.out.println(result ? "true" : "false");
    }
}
