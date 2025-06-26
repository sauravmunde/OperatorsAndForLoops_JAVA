public class Basic {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a++;
        --b;

        // int c = a-- + b--;

        // System.out.println(b);
        int c = a-- + b--;
        System.out.println(b);

        System.out.println(++c);
        // practice
        System.out.println(a++ + --b);

    }

}
