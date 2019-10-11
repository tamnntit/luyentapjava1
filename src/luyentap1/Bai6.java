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
public class Bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, m, a[][], b[][];
        t = in.nextInt();
        for(int tt = 1; tt <= t; tt++) {
            n = in.nextInt();
            m = in.nextInt();
            a = new int[n+1][m+1];
            b = new int[m+1][n+1];
            
            long x[][] = new long [n+1][n+1];
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= m; j++) {
                    a[i][j] = in.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    x[i][j] = 0;
                    for(int k = 1; k <= m; k++) {
                        x[i][j]+= a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + tt +":");
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    System.out.print(x[i][j]+" ");
                }
                System.out.println("");
            }
            
            
        }
    }
}
