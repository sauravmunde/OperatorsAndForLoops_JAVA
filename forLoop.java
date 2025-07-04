public class forLoop {
    public static void main(String[] args) {

        // first code

        for (int i = 1; i < 10; i *= 2) {

            System.out.println(i);
        }

        // second code

        for (int i = 438; i > 0; i = i % 3) {

            System.out.print("*");
        }
        System.out.println();
        // break key words

        for (int i = 0; i < 5; i++) {

            System.out.print(i + " ");

            i = i + 1;
        }
        // fourth code

        for (int i = 0; i < 2; i = i + 1) {

            for (int j = 0; j < 2; j = j + 1) {

                if (j == 1)

                    break;
 
                System.out.println(j + "");
            }
   
        }

    }

}
