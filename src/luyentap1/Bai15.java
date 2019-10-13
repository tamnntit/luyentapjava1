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
public class Bai15 {
    static int n, k, x[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            x = new int[41];
            for(int i =1; i <= k; i++) x[i] = in.nextInt();
            gen();
        }
    }
    static void gen() {
        int z[] = new int[41];
        for(int zz = 1; zz<=n; zz++) z[zz] = 0;
        for(int zz = 1; zz <= k; zz++) z[x[zz]]++;
        
        int i = k;
        while(i > 0 && x[i] == n - k + i) i--;
        if(i > 0) {
            x[i] = x[i] + 1;
            for(int j = i+1; j<= k; j++) {
                x[j] = x[i] + j - i;
                
            }
        }
        int count = k;
        for(int m = 0; m<=k; m++) {
            if(z[x[m]] == 1) count--;
            
        }
        System.out.println(count == 0 ? k : count);
        
//        System.out.println(count==0?k:count);
    }
}
