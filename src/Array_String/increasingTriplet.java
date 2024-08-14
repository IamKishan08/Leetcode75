package Array_String;

public class increasingTriplet {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};

        boolean answer = increasing(nums);

        System.out.println(answer);
    }

    private static boolean increasing(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MAX_VALUE;

        for (int num : nums){
            if(num <= smallest){
                smallest = num;
            }else if(num<= largest){
                largest = num;
            }
            else {
                System.gc();  // Use this for best space complexity
                return true;
            }
        }
       /* for (int i = 0; i < nums.length-2; i++) {
            if (nums[i]<nums[i+1]){
                if(nums[i+1]<nums[i+2]){
                    return true;
                }
            }
        }
         if (nums.length < 3)
            return false;

        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > second) {
                System.gc();
                return true;
            } else if (n > first)
                second = n;
            else
                first = n;
       }
       return false;
       */
        return false;
    }
}
