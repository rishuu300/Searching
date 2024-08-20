public class Peak_Element {
    public static int naive(int arr[]){
        if(arr.length==1)
           return arr[0];
        if(arr[0]>=arr[1])
           return arr[0];
        if(arr[arr.length-1]>=arr[arr.length-2])
           return arr[arr.length-1];

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>=arr[i+1] && arr[i]>=arr[i-1])
               return arr[i];
        }
        return -1;
    }
    public static int efficient(int arr[]){
      int n = arr.length;
      int low = 0, high = n-1;
       
      while(low<=high){
          int mid = (low+high)/2;
          
          if((mid==0 || arr[mid] >= arr[mid-1]) && (mid==n-1 || arr[mid] >= arr[mid+1])){
              return arr[mid];
          }
          else if(mid > 0 && arr[mid-1] >= arr[mid]){
              high = mid-1;
          }
          else{
              low = mid+1;
          }
      }
      
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = {34,56,67,93,98,82};
        System.out.println(naive(arr));
        System.out.println(efficient(arr));
    }
}
