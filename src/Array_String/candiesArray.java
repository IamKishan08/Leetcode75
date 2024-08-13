package Array_String;

import java.util.ArrayList;
import java.util.List;

public class candiesArray {

    public static void main(String[] args) {
        int[] arr = {12,1,12};
        int target = 10;

        List<Boolean> ans = candies(arr,target);

        System.out.println(ans);

    }

    private static List<Boolean> candies(int[] arr, int target) {

        List<Boolean> answer = new ArrayList<>();
        int size = arr.length;
        int maxcandy =0;
        for(int i = 0 ; i<size; i++){
            maxcandy = Math.max(maxcandy,arr[i]);
        }
        for(int i = 0; i < size; i++) {
            if ((arr[i]+target)>=maxcandy){
                answer.add(Boolean.TRUE);
            }
            else {
                answer.add(Boolean.FALSE);
            }

        }

        return answer;
    }
}
