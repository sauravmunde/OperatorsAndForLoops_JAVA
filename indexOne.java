public class indexOne {
    public static void main(String[] args) {

        int a = 10, b = -20;
        System.out.println(a ^ b);
        System.out.println(a >> 2);

        System.out.println();

        int s = 42;
        int p = ~s;
        System.out.println(p + " " + s);

        int x = 10, y = 1;
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);

    }

}
