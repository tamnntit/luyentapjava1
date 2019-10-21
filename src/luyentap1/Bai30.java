/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai30 {
    static int n, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            
            Arrays.sort(a);
            
            boolean ok = false;
            for(int i = 2; i < n; i++) {
                if(a[i-2] + a[i-1] > a[i]) {
                    ok = true; break;
                }
            }
            if(ok)
                System.out.println("YES");
            else System.out.println("NO");
        }
        
        
    }
}
