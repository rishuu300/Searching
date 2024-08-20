public class Rotated_Sorted {
    public static int rsted(int arr[], int x){
        int l=0; int h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==x)
               return mid;
            if(arr[l]<=arr[mid]){
                if(x>=arr[l] && x<arr[mid])
                   h = mid-1;
                else
                   l = mid+1;
            }
            else{
                if(x>arr[mid] && x<=arr[h])
                   l = mid+1;
                else
                   h = mid-1;
            }
        }
        return -1;
    }

    // Another Way
    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                if(arr[high] >= arr[mid] || arr[high] < key){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(arr[mid] < key){
                    if(arr[low] <= arr[mid] || arr[low] > key){
                        low = mid+1;
                    }
                    else{
                        high = mid-1;
                    }
                }
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,1};
        System.out.println(rsted(arr,0));
    }
}
