public class DSA_79 {
    public static int max_Subarray(int[] nums, int k){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(j < n){
            sum += nums[j];
            if(j - i + 1 == k){
                max_sum = Math.max(max_sum, sum);
                sum -= nums[i];
                i++;
            }
            
            j++;
        }
        return max_sum;
    }
    public static void main(String args[]){
        int[] nums = {1, 4, 5, 7, 9, 0};
        int k = 3;
        System.out.println("THE MAXIMUM SUBARRAY SUM IS : "+ max_Subarray(nums, k));
    }
}
