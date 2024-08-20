public class Min_Sorted_Rotated {
    public static int min(int arr[], int low, int high){
        if (arr[low] < arr[high]){
            return arr[low];
        }
        
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9,10,1,2};
        System.out.println(min(arr,0,arr.length-1));
    }
}
