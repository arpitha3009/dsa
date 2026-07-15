package array;

public class maxSubarray {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};

        int big = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                sum = sum + nums[j];
            }
            if(sum>big){
                big = sum;
            }

        }
        System.out.println(big);
    }
}
