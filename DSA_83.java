import java.util.*;
public class DSA_83 {
    public static int longest_consecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int cur_num = num;
                int cur_streak = 1;
                while(set.contains(cur_num+1)){
                    cur_num++;
                    cur_streak++;
                }
                longest = Math.max(longest, cur_streak);
            }
        }
        return longest;


    }
    public static void main(String[] args){
        int[] nums= {0,1,2,3,7,9};
        System.out.println(longest_consecutive(nums));
    }
}
