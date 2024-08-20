public class Capacity_To_Ship_Packages_Within_D_Days {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for(int i=0; i<n; i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int min_days = minDays(arr,n,mid);
            if(min_days<=d){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
    
    static int minDays(int arr[], int n, int capacity){
        int days = 1, sum = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] <= capacity-sum){
                sum += arr[i];
            }
            else{
                days++;
                sum = arr[i];
            }
        }
        
        return days;
    }
    public static void main(String[] args) {
        
    }
}
