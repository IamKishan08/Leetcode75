package Two_pointers;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean answer = subSeq(s,t);
        System.out.println(answer);
    }

    private static boolean subSeq(String s, String t) {
        int i =0; int j =0;
        char[] cS = s.toCharArray();
        char[] tS = s.toCharArray();
        while(i<cS.length && j < tS.length){
            if(cS[i] ==  tS[j]){
                i++;
            }
            j++;
        }

        return i == s.length();
    }

}
