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
public class Bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, a[] = new int[101];
        t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            for(int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
            }
            if(check(a, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
        
    }
    
    public static boolean check(int a[], int n) {
        int start = 1, end = n;
        while(start < end) {
            if(a[start] != a[end]) {
                return false;
            }
            start++; end--;
        }
        return true;
    }
}
