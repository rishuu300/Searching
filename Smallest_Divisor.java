public class Smallest_Divisor {
    public static int smallestDivisor(int[] nums, int K) {
        int low = 1, high = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            high = Math.max(high,nums[i]);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int sum = count(nums,mid);
            if(sum <= K){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
    
    public static int count(int arr[], int divisor){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + (int)Math.ceil((double)arr[i]/divisor);
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
