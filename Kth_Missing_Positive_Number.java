public class Kth_Missing_Positive_Number {
    public static int missingK(int[] arr, int n, int k) {
        int low = 0, high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if((arr[mid] - (mid + 1)) >= k){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return k+low;
    }
    public static void main(String[] args) {
        
    }
}
