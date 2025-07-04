/* Problem statement
Print the following pattern for given number of rows.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input :
   5
Sample Output :
 *4321
5*321
54*21
543*1
5432*
*/
public class Test_3 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            int num = 5;

            for (int col = 0; col < n; col++) {
                if (col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(num);
                }
                num--;
            }
            System.out.println();
        }
    }
}
