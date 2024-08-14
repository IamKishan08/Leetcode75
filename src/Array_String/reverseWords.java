package Array_String;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class reverseWords {
    public static void main(String[] args) {
        String s = "Hello World";
        String answer = reverseWordsArray(s);
        String ans1 = reverseRecursive(s);
        System.out.println(ans1);
    }
     // Recursive Method
    private static String reverseRecursive(String s){

        char[] c = s.toCharArray();
        char[] r = new char[c.length];

        int ri = findCopyWord(c, r, 0, 0);

        return new String(r, 0, ri);
    }

    private static int findCopyWord(char[] c, char[] r, int i, int ri) {
       while(i<c.length && c[i]==' ')  i++;
       int e= i;
       while (e<c.length && c[e]!=' ') e++;

       if(i==e) return ri;
       ri = findCopyWord(c,r,e+1,ri);
       if(ri>0){
           r[ri]=' ';
           ri++;
       }
        for(int j = i; j < e; j++) {
            r[ri++] = c[j];
        }
      return ri;
    }


    //Iterating Method using In-built Function
    private static String reverseWordsArray(String s) {

        String[] words = s.split("\\s+");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words).trim();
    }


}
