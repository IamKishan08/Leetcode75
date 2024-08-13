package Array_String;

public class mergeString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "pqr";
        String result = mergeAlter(a,b);
        System.out.println(result);

        String result2 = mergeAlterOptimize(a,b);
        System.out.println(result2);
    }

    //Memory 0ms
    public static  String mergeAlter(String word1, String word2){
        int m = word1.length();
        int n = word2.length();
        StringBuilder answer  = new StringBuilder();
        for(int i = 0; i < m || i<n; i++) {
            if(i<m){
                answer.append(word1.charAt(i));

            }
            if(i<n){
                answer.append(word2.charAt(i));
            }
        }
        return  answer.toString();
    }
    //Time 0ms
    public static String mergeAlterOptimize(String word1,String word2){
        StringBuilder answer = new StringBuilder();
        int i=0; int j=0;
        int len1 = word1.length();
        int len2 = word2.length();
        while (i< len1 && j<len2){
            answer.append(word1.charAt(i));
            answer.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i<len1){
            answer.append(word1.substring(i));
        } else if (j<len2) {
            answer.append(word2.substring(j));
        }
        return answer.toString();
    }
}
