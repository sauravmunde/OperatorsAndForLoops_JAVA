public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 10, b = 20;

        int c = a & b;
        System.out.println(c);

        int d = a | b;
        System.out.println(d);

        int e = a ^ b;
        System.out.println(e);

        int f = c + d + e;
        System.out.println(~f);

    }

}
