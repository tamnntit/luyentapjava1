/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author nntam
 */
public class Bai27 {
    static int n;
    static long e = 1000000007; 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        PriorityQueue<Long> p = new PriorityQueue<Long>();
        Long x;
        for(int i = 0; i < n; i++) {
            x = in.nextLong();
            p.add(x);
            
        }
        Long a, b, s;
        long count = 0;
        while((true)) {
            a = p.poll();
            b = p.poll();
            if(a != null && b != null) {
                s = (a+b)%e;    
                p.add(s);
                count+=s;
                count %= e;
                        
            }
            else  {
                
                break;
            }
        }
        System.out.println(count);
//           Integer v;
//        while((v = p.poll() ) != null ) {
//            System.out.println(v);
//    }
    }
}
