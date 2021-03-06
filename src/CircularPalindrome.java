import java.io.*;
import java.util.*;

public class CircularPalindrome {

    // I found this on stackoverflow it was about 3 times faster for a test I ran
    static boolean isPali(String str){
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    static int subs(String s){
        int max=0;
        for(int j = 0 ; j < s.length(); j++ ) {
            for (int i = 1; i <= s.length() - j; i++) {
                String sub = s.substring(j, j+i);
                if(isPali(sub) && sub.length()>max){
                    max = sub.length();
                }
            }

        }
        return max;
    }

    static void rotation(int k,String s) {
        for (int i = 0; i < k; i++) System.out.println(subs(s.substring(i, k) +s.substring(0, i)));
    }


    public static void main(String args[]) {
        String s;
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
       s = in.next();
        rotation(k,s);
    }
}