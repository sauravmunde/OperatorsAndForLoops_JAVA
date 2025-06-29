public class BitwiseOperatorstwo {
    public static void main(String[] args) {

        System.out.println();
        // first logic
        int a = 3;

        System.out.println("1] " + a++ * 8 + " \n   " + ++a * 8);
        System.out.println();
        // second logic

        int x = 15;

        int y = ++x;

        int z = ++y;

        System.out.println("2] " + z + "\n");

        // third logic

        int s = 10, k = 20;

        if (s++ > 10 && ++k > 20) {
            System.out.print(" inside if ");
        } else {

            System.out.print("3]" + " inside else ");
        }

        System.out.println(s + " " + k + "\n");

        // fourth logic

        int t = 10, u = 20;

        if (t++ > 10 || ++u > 20) {

            System.out.print("inside if");
        } else {

            System.out.print("inside else ");
        }

    }
}