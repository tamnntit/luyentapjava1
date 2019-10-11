/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.Scanner;




public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int k, n;
       long a[] = new long[100];
        a[0] = 0; a[1] = 1;
        for(int i = 2; i <= 92; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        k = in.nextInt();
        while(k-- > 0) {
            n = in.nextInt();
            System.out.println(a[n]);
        }
    }
    
}
