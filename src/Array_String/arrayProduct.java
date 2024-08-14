package Array_String;

import java.util.Arrays;

public class arrayProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result =  productExcept(arr);
        System.out.println(Arrays.toString(result));
    }


    private static int[] productExcept(int[] arr){
        int[] result = new int[arr.length];

        result[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            result[i] = result[i-1] * arr[i-1];
        }

        int right = 1;
        for (int i = arr.length - 1; i >= 0 ; i--) {
           result[i] *= right;
           right *= arr[i];
        }
        return result;
    }


    // Time Complexity O(n2)
    private static int[] productExceptSelf(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int ans =1; int j = 0;
            for (j = 0; j < arr.length; j++) {
                if( j != i){
                    ans = ans * arr[j];
                }
            }
            answer[i] = ans;
        }
        return answer;
    }
}
