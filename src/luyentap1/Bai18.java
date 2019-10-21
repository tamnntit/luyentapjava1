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
public class Bai18 {
    static int n, x[] = new int[20], total = 0;
    
    static boolean cot[] = new boolean[20], xuoi[]= new boolean[40], nguoc[]= new boolean[40];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        Try(1);
        System.out.println(total);
        
    }
    
    static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(!cot[j] && !xuoi[i-j+n]&&!nguoc[i+j-1]) {
                x[i] = j;
                cot[j] = true; xuoi[i-j+n] = true; nguoc[i+j-1] = true;
                if(i == n) total++;
                else Try(i+1);
                cot[j] = false; xuoi[i-j+n] = false; nguoc[i+j-1] = false;
            }
            
        }
    }
    
    static void check() {
        
    }
}
