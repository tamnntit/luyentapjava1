/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luyentap1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author nntam
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        ArrayList<Pair> arr = new ArrayList<Pair>();
        n = Integer.parseInt(in.nextLine());
        while(n-- > 0) {
            s = in.nextLine();
            // bieens cuoi nay thanh dinh dang dep 
            StringTokenizer str = new StringTokenizer(s);
            ArrayList<String> list = new ArrayList<String>();
            while(str.hasMoreTokens()) {
                String a = str.nextToken().toLowerCase();
                list.add(a);
                
//                System.out.println(str.nextToken());
            }
            int size = list.size();
            String result = "";
            if(size > 0) {
                result = list.get(size-1);
                for(int i = 0; i < size-1; i++) {
                    result += list.get(i).charAt(0);
                }
            }
            
            int sizeA = arr.size();
            int stt = 1;
            for(int i = sizeA-1; i >=0; i--) {
                if(arr.get(i).pre.equals(result)) {
                    stt = arr.get(i).stt + 1;
                    break;
                }
            }
            arr.add(new Pair(result, stt));
            System.out.println(result+(stt==1?"":stt)+"@ptit.edu.vn");
            
        }
    }
    
    
    
    static class Pair {
        public String pre;
        public int stt; // so thu tu cua 

        public Pair(String pre, int stt) {
            this.pre = pre;
            this.stt = stt;
        }
        
    }
}
