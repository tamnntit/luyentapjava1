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
public class Bai28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String a1 = a.replaceAll("6", "5");
        String a2 = a.replaceAll("5", "6");
        String b1 = b.replaceAll("6", "5");
        String b2 = b.replaceAll("5", "6");
        
        System.out.print(Integer.parseInt(a1) + Integer.parseInt(b1) + " ");
        System.out.println(Integer.parseInt(a2) + Integer.parseInt(b2));
    }
    
}
