import java.util.HashSet;
import java.util.Set;

public class Three_Sum {
    public static boolean pairSum(int arr[], int start, int end, int sum){
        Set<Integer> s = new HashSet<>();
        
        for(int i=start; i<end; i++){
            if(s.contains(sum-arr[i])){
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }
    public static boolean find3Numbers(int arr[], int n, int x) {
        for(int i=0; i<n; i++){
            if(pairSum(arr, i+1, n, x-arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
