public class Count_1s {
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
    public static int count(int arr[]){
        int first = first(arr,1);
        if(first==-1)
           return 0;
        else
            return arr.length - first;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,1,1};
        System.out.println(count(arr));
    }
}
