public class Index_of_first_1_in_a_sorted_array_of_0s_and_1s {
    public long firstIndex(long arr[], long n)
    {
        int low = 0;
        int high = (int)n-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid] == 1 && (mid == 0 || arr[mid-1] != 1)){
                return mid;
            }
            else if(arr[mid] == 1 && arr[mid-1] != 0){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
