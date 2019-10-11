/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nntam
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n, x, a[] = new int[100002];
        
        t = in.nextInt();
        for(int tt = 1; tt <= t; tt++) {
            int i = 0;
            for(i= 0; i< 100002; i++) {
                a[i] = 0;
            }
            
            n = in.nextInt();
            int v[] = new int[102], vv=0;
            for(i = 1; i<=n; i++) {
                x = in.nextInt();
                a[x]++;
                if(a[x] == 1) {
                    v[vv++] = x;
                }
            }
            
            System.out.println("Test " + tt + ":");
            for(i = 0; i< vv; i++) {
                System.out.println(v[i] + " xuat hien " + a[v[i]] + " lan");
            }
        }
    }
}
