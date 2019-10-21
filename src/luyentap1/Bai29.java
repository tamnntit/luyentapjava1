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
public class Bai29 {
    static int n, k, a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int vt = -1;
        for(int i = 1; i <= n-k; i++) {
            char max = 0;
            for(int j =vt+1; j<k+i; j++) {
                if(s.charAt(j) > max) {
                    max = s.charAt(j);
                    vt = j;
                    if(max == 9) break;
                }
            }
            System.out.print(max);
        } 
        
    }
}
