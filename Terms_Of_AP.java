/*
Problem statement
Write a program to print the first x terms of the mathematical series 3N + 2 which are not multiples of 4.

The series is defined as:

T(N) = 3N + 2, where N is a positive integer starting from 1. Your task is to print the first x terms of this series, but you should exclude any term that is a multiple of 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17 


 */

import java.util.Scanner;

public class Terms_Of_AP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int count = 0;

        int N = 1;

        while (count < x) {

            int term = 3 * N + 2;

            if (term % 4 != 0) {

                System.out.print(term + " ");

                count++;
            }

            N++;
        }
    }
}