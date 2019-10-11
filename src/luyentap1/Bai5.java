/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package luyentap1;

import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, a[][] = new int[12][12], t[][] = new int[12][12];;
        n = in.nextInt();
        m = in.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 1; i <=m; i++) {
            for(int j = 1; j <=n; j++) {
                t[i][j] = a[j][i];
            }
        }
        for(int i = 1; i <=m; i++) {
            for(int j = 1; j <=n; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
