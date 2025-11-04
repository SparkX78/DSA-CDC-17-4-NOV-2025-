import java.util.*;
public class DSA_81 {
    public static int[] range_addition(int[][] updates, int n){
        int[] arr = new int[n+1];
        for(int[] op : updates){
            int start = op[0];
            int end = op[1];
            int value = op[2];
        
            arr[start] += value;
            if(end+1 < n){
                arr[end+1] -= value;
            }
        }
        for(int i = 1; i <= n; i++){
            arr[i] += arr[i-1]; 
        }
        return Arrays.copyOf(arr,n);
    }
    public static void main(String[] args){
        int[][] updates = {{2, 5, 1}, {1, 5, 9}, {4, 1, 6}};
        int n = 5;
        int[] result = range_addition(updates, n);
        System.out.println(Arrays.toString(result));
    }
}
