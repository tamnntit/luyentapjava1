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
public class Bai3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, a[] = new int[102];
        t = in.nextInt();
        for(int tt = 1; tt <= t; tt++) {
            n = in.nextInt();
            int icre = 0; // so chu so tang dai nhat
            a[0] = 0; // so mac dinh, khong tinh
            //2 3 5 7 4 5 8 9 7 11 8 9 6 7 10 12
            int max1 = 0;
            for(int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                if(a[i] > a[i-1]) icre++;
                else 
                {
                    icre = 1;
                }
                 if(icre > max1) max1 = icre;
            }
            icre = 0;
            System.out.println("Test " + tt + ":");
            System.out.println(max1);
            for(int i = 1; i <= n; i++) {
                if(a[i] > a[i-1]) icre++;
                else 
                {
                    icre = 1;
                }
                if(icre == max1) {
                   int k = i-max1+1;
                   for(int j = 0; j<max1; j++) {
                       if(j == max1-1) System.out.println(a[j+k]);
                       else System.out.print(a[j+k]+ " ");
                   }
                }
            }
            
            
                    
            
        } 
    }
    
}
