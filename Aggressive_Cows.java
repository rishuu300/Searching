import java.util.Arrays;

public class Aggressive_Cows {
    public static int count(int arr[], int gap, int n){
        int curr = 0; 
        int count = 1;
       
        for(int i=0; i<n; i++){
            if(Math.abs(arr[curr] - arr[i]) >= gap){
                count++;
                curr = i;
            }
        }
       
       
        return count;
    }
    
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        
        int low = 1, high = stalls[n-1];
        high = high - low;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int cows = count(stalls,mid,n);
            
            if(cows >= k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return high;
    }
    public static void main(String[] args) {
        
    }
}
