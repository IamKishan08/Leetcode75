package Array_String;

public class reverseVowels {
    public static void main(String[] args) {
         String s = "leetcode";
         String answer = reverse(s);
        System.out.println(answer);
    }

    private static String reverse(String s){

        boolean[] vowels = new boolean[128];

        for (char ch : "aeiouAEIOU".toCharArray()){
            vowels[ch] = true;
        }
        char[] chars = s.toCharArray();
        int i=0; int j= chars.length-1;

        while (i<j){
            while (i<j && !vowels[chars[i]]){
                ++i;
            }
            while (i<j && !vowels[chars[j]]){
                --j;
            }
            if(i<j){
                char t = chars[i];
                chars[i] = chars[j];
                chars[j] = t;
                ++i;
                --j;
            }
        }

        return String.valueOf(chars);
    }
// another method
    private static String reverseVowel(String s) {
       StringBuilder sb = new StringBuilder(s);
       int l=0;
       int r = s.length()-1;
       while(l<r){
           while(l<r && !(isVowel(sb.charAt(l)))){
               ++l;
           }
           while(l<r && !(isVowel(sb.charAt(r)))){
               --r;
           }
           sb.setCharAt(l,s.charAt(r));
           sb.setCharAt(r,s.charAt(l));
           ++l;
           --r;
       }
       return sb.toString();
    }
    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
