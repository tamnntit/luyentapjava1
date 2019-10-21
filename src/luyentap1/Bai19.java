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
public class Bai19 {
    static long n, x;
    static long a[];
    static boolean ok = true;
    static int max = 16;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            a = new long[max+1];
            n = in.nextInt();
            ok = true;
            for(int i = 1; i <=max; i++) a[i] = 0;
            while(ok ) {
                sinh();
                print();
            }
            
        }
    }
    
    static void sinh() {
        int i = max;
        while(i > 0 && a[i] == 1) {
            a[i] = 0; i--;
        }
        if(i > 0) {
            a[i] = 1;
        } else ok = false;
    }
    
    static void print() {
        String s = "";
        for(int i = 1; i <= max; i++) {
            s+=String.valueOf(a[i]);
        }
        s = s.replaceAll("1", "9");
        long a1 = Long.parseLong(s);
        if(a1 % n == 0) {
            System.out.println(a1);
            ok = false;
        }
        
      
        
    }
}
