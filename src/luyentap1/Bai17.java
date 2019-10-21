/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai17 {
    static int n, k, x[] = new int[20], c[][] = new int[20][20];
    static boolean check[] = new boolean[20];
    static ArrayList<String> arr = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                c[i][j] = in.nextInt();
            }
        }
        Try(1);
        System.out.println(arr.size());
        for(String s: arr) {
            System.out.println(s);
        }
    }
    
    static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(!check[j]) {
                x[i] = j;
                check[j] = true;
                if(i == n) print();
                else Try(i+1);
                check[j] = false;
            }
            
        }
    }
    
    static void print() {
        int total = 0;
        for(int i = 1; i <= n; i++) {
            total += c[i][x[i]];
        }
        if(total == k) {
            String s = "";
            for(int i = 1; i < n; i++) {
                s += x[i]+" "; 
            }
            s+= x[n];
            arr.add(s);
        }
    }
    
}
