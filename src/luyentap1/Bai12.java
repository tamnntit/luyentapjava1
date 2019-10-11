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
public class Bai12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        String s;
        t = Integer.parseInt(in.nextLine());
        while(t-- > 0) {
            // dung split thu thay string token
            s = in.nextLine();
            s = s.toLowerCase();
            s = s.trim();
            
            String str[] = s.split(" +");
            String result = "";
            
            
            for(int i = 0; i < str.length -1; i++) {
                String a = String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1);
                System.out.print(a + " ");
            }
            String a = String.valueOf(str[str.length-1].charAt(0)).toUpperCase() + str[str.length-1].substring(1);
            System.out.println(a);
        }
        
    }
    
}
