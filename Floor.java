public class Floor {
   static int findFloor(long arr[], int n, long x) {
      int low = 0, high = n-1;
      int res = -1;
      
      while(low<=high){
         int mid = (low+high)/2;
          
         if(arr[mid] == x){
            return mid;
         }
         else if(arr[mid] < x){
            res = mid;
            low = mid+1;
         }
         else{
            high = mid-1;
         }
      }
      
      return res;
   }
   public static void main(String[] args) {
      
   }
}
