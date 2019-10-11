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
public class Bai10 {
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
        while(start <= end) { // cho <= de bat luon truong hop chuoi nay le mat 1 so o giua
            int d = (int)s.charAt(start) - 48, c = (int)s.charAt(end)-48;
            if(d != c || checkPrime(d)) {
                return false;
            }
            start++; end--;
        }
        return true;
    }
    
    // cac so nguyen to nho hon 10
    public static boolean checkPrime(int x) {
        if(x == 2 || x == 3 || x == 5 || x == 7) return false;
        return true;
    }
    
}
