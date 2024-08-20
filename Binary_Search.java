public class Binary_Search{
    public static void iterative(int arr[], int x){
        int l = 0; int h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==x){
                System.out.println(true);
                return;
            }
            else if(arr[mid]>x)
                h = mid-1;
            else
                l = mid+1;
        }
        System.out.println(false);
    }

    public static boolean recursive(int arr[], int x, int l, int h){
        if(l>h)
           return false;
        int mid = (l+h)/2;

        if(arr[mid]==x)
           return true;
        else if(arr[mid]>x)
            return recursive(arr,x,l,mid-1);
        else
            return recursive(arr,x,mid+1,h);
    }
    public static void  main(String[] args){
        int arr[] = {1,2,3,4,5};
        iterative(arr,5);
        System.out.println(recursive(arr,5,0,arr.length-1));
    }
}