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
public class Bai9 {
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
        int length = s.length(); 
        int start = 0, end = length-1;
        if((int)s.charAt(0) - 48 != 8 ) return false;
        int total = 0;
        while(start < end) {
            int d = (int)s.charAt(start) - 48, c = (int)s.charAt(end)-48;
            if(d != c) {
                return false;
            }
            total += d + c;
            start++; end--;
        }
        
        if(length % 2 != 0) total += s.charAt(length/2) - 48;
        if(total % 10 != 0) return false;
        return true;
        
    }
}
