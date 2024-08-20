public class Triplet_Sum {
    public static void sum(int arr[], int sum){
        for(int i=0; i<arr.length; i++){
            if(isPair(arr,sum-arr[i],i+1,arr.length-1)){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(false);
    }

    private static boolean isPair(int[] arr, int sum, int l, int r) {
        while(l<=r){
            if(arr[l]+arr[r]==sum){
                System.out.print(arr[l]+" "+arr[r]+" ");
                return true;
            }
            else if(arr[l]+arr[r]>sum)
                r--;
            else
                l++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,8,9,20,40};
        sum(arr,32);
    }
}
