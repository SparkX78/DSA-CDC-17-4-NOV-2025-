import java.util.*;
public class DSA_84 {
    public static int longestSubstring(String s){
        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        String s = "abccbui";
        System.out.println("THE MAXIMUM LONGEST SUBSTRING LENGTH : "+ longestSubstring(s));
    }
}
