/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai24 {

    static int n;
    static int a[] = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            int i = 0;
            int count = 0;
            while (n > 0 && i <= 9) {
                int x = n / a[i];
                n -= x * a[i];
                i++;
                count += x;
            }
            System.out.println(count);

        }
    }

}
