package Array_String;

public class mergeString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "pqr";
        String result = mergeAlter(a,b);
        System.out.print(result);
    }
    public static  String mergeAlter(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        StringBuilder answer  = new StringBuilder();
        for(int i = 0; i < m || i<n; ++i) {
            if(i<m){
                answer.append(word1.charAt(i));
            }
            if(i<n){
                answer.append(word2.charAt(i));
            }
        }
        return  answer.toString();
    }



}
