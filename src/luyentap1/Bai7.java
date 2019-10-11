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
public class Bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n;
        t = in.nextInt();
        for(int tt=1; tt<=t; tt++) {
            n = in.nextInt();
            int a[][] = new int[n+1][n+1], i = 1, j = 1;
            int k = n*n, p = 1, q = 1, row = n, col = n;
            while(k > 0) {
                // vong for duyet hang dau
                for(i = p; i <= col; i++) {
                    a[p][i] = k--;
                }
                
                // vong for o hang cuoi, bor phan tu dau tien
                for(i = p+1; i <= row; i++) {
                    a[i][col] = k--;
                }
                
                //dong for cho hang cuoi bo phan tu cuoi cung
                for(i = col- 1; i >=p; i--) {
                    a[row][i] = k--;
                }
                
                // duy cot dau tien ben trai // bo 2 diem dau va cuoi
                for(i = row - 1; i >= p+1; i--) {
                    a[i][p] = k--;
                }
                p++; row--; col--;
                
            }
            System.out.println("Test " + tt +":");
            for(i = 1; i <= n; i++) {
                for(j = 1; j<= n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
             
        }
        
    }
}
