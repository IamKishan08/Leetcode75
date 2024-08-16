package Two_pointers;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {1,5,3,0,5};

        move(nums);
    }

    private static void move(int[] nums ){
        int left =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;
                left++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}

