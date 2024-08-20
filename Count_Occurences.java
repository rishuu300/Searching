public class Count_Occurences {
    public static int first(int arr[], int x){
        int l=0; int h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>x)
               h = mid-1;
            else if(arr[mid]<x)
               l = mid+1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                   return mid;
                else
                    h = mid-1;
            }
        }
        return -1;
    }
    public static int last(int arr[], int x){
        int l=0; int h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>x)
               h = mid-1;
            else if(arr[mid]<x)
               l = mid+1;
            else{
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
                   return mid;
                else
                    l = mid+1;
            }
        }
        return -1;
    }
    public static int count(int arr[], int x){
        int first = first(arr,x);
        if(first==-1)
           return -1;
        else 
           return (last(arr,x)-first+1);
    }

    // Efficient Way
    public static int count(int[] arr, int n, int x){
        int low = 0, high = n-1;
        
        while(low<=high){
            if(arr[low] == x && arr[high] == x){
                return high-low+1;
            }
            
            if(arr[low] != x) low++;
            if(arr[high] != x) high--;
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {34,56,67,82,82,82,93,98};
        System.out.println(count(arr,82));
    }
}
