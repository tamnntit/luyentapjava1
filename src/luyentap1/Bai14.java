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
public class Bai14 {
    static int n, k, c;
    static int x[];
    static ArrayList<String> arr;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        x = new int[20];
        c = 0;
        arr = new ArrayList<String>();
        Try(1);
        System.out.println(arr.size());
        for(String s: arr) {
            System.out.println(s);
        }
    }
    
    static void Try(int i) {
        for(int j = 0; j<= 1; j++) {
            x[i] = j;
            if(i == n) print();
            else Try(i+1);
        }
    }
    
    static void print() {
        boolean ok = false;
        int count = 0; 
        for(int i = 1; i <= n; i++) {
            if(x[i] == 0) {
                count++;
                
            } else {
                if(count == k) {
                    ok = true;
                }
                count = 0;
            }
        }
        if(count == k) ok = true;
        if(ok) {
            String s = "";
            for(int i = 1; i <= n; i++) {
                s += (x[i] == 0)?"A":"B";
            }
            arr.add(s);
        }
    }
    
}
