public class DSA_80 {
    public static int max_Window(int[] nums){
        int max_sum = Integer.MIN_VALUE;
        int max_window = 0;
        int sum = 0;
        
        int i = 0;
        int j = 0;
        int n = nums.length;
        while(j < n){
            sum += nums[j];
            
            if(sum > max_sum){
                max_window = j-i+1;
                max_sum = sum;
            }
            else if(sum == max_sum){
                max_window = Math.max(j-i+1, max_window);
                
            }
            if(sum < 0){
                max_sum = 0;
                i = j+1;
            }
            j++;
        }
        return max_window;
        

    }
    public static void main(String args[]){
        int[] nums = {2, 1, 3, 4, 215, 7, 9};
        System.out.println(max_Window(nums));

    }
}
