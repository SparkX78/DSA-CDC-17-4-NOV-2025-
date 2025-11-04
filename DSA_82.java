public class DSA_82 {
    public static boolean car_pooling(int[][] car, int capacity){
        
        int[] changes = new int[1001];
        for(int[] op: car){
            int no_Passenger = op[0];
            int From = op[1];
            int To = op[2];

            changes[From] += no_Passenger;
            changes[To] -= no_Passenger;
        }
        int current = 0;
        for(int i = 0; i< 1001; i++ ){
            current += changes[i];
            if(current > capacity){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] car = {{2,1,5}, {4, 3, 6}};
        int capacity = 6;
        System.out.println(car_pooling(car, capacity));
    }
}
