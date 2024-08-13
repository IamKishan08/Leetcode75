package Array_String;

public class canPlaceFlowers {
    public static void main(String[] args) {
       int[] flowerbed = {1,0,0,0,1};
       int n = 1;
       boolean ans = canPlace(flowerbed,n);
       System.out.println(ans);
    }
    public static boolean canPlace(int[] flowerbed,int n){

        int len = flowerbed.length;

        for(int i = 0; i < len; i++) {
            int left = i == 0 ? 0 : flowerbed[i-1];
            int right = i == len-1 ? 0 : flowerbed[i+1];
            if((left + flowerbed[i]+ right) == 0 ){
                flowerbed[i] = 1;
                --n;
            }
        }
        return n<=0;
    }
}
