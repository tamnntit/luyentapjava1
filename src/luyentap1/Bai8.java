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
public class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        String s;
        t = Integer.parseInt(in.nextLine());
        
        while(t-- > 0) {
            s = in.nextLine();
            
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean check(String s) {
        int start = 0, end = s.length()-1;
            while(start < end) {
                int d = (int)s.charAt(start) - 48, c = (int)s.charAt(end)-48;
                if(d != c || d % 2 != 0) {
                    return false;
                }
                start++; end--;
            }
        return true;
        
    }
}
