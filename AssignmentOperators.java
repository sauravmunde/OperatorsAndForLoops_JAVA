public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // first
        
        if (a == b) {
            System.out.println("first");
        } else if (a != b) {
            System.out.println("second");
        } else {             
                                     
             
            System.out.println();
        }

        // second

        a = 5;

        a += 5 + (++a) + (a++);
        System.out.println(a);

        // third 

    }
}
