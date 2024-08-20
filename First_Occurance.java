public class First_Occurance {
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

    public static int recursive(int arr[], int x, int l, int h){
        if(l>h)
           return -1;
        int mid = (l+h)/2;

        if(arr[mid]>x)
           return recursive(arr,x,l,mid-1);
        else if(arr[mid]<x)
           return recursive(arr,x,mid+1,h);
        else{
            if(mid==0 || arr[mid-1]!=arr[mid])
               return mid;
            else
                return recursive(arr,x,l,mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {34,56,67,82,82,82,93,98};
        System.out.println(first(arr,82));
        System.out.println(recursive(arr, 82, 0, arr.length-1));
    }
}
