public class The_Painters_Partition_Problem_II {
    static long minTime(int[] arr,int n,int k){
        long low = arr[0];
        long high = arr[0];
        
        for(int i=1; i<n; i++){
            low = Math.min(low, arr[i]);
            high += arr[i];
        }
        
        while(low<=high){
            long mid = (low+high)/2;
            
            if(count(arr,mid,n) > k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
    static int count(int arr[], long time, int n){
        int count = 1;
        long sum = 0;
        
        for(int i=0; i<n; i++){
            if(sum+arr[i] <= time){
                sum += arr[i];
            }
            else{
                if(arr[i] > time){
                    return Integer.MAX_VALUE;
                }
                else{
                    sum = arr[i];
                }
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
