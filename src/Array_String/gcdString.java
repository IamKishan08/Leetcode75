package Array_String;

public class gcdString {

    public static void main(String[] args) {
        String a = "ABCABCABCABC";
        String b = "ABC";
        String result = gcdOfString(a,b);
        System.out.println(result);
    }

    private static String gcdOfString(String a, String b) {
        if(!(a+b).equals(b+a)){
            return "";
        }
        int m= a.length();
        int n = b.length();
        int gcd;
        if(m>n){
            gcd = GCD(m,n);
        }else {
           gcd = GCD(n,m);
        }
       return a.substring(0,gcd);
    }

    private static int GCD(int a, int b) {
        if(b ==0){
            return a;
        }
        return GCD(b,a%b);
    }

}
