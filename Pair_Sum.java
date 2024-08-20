public class Pair_Sum {
    public static void sum(int arr[], int sum){
        int l=0; int r=arr.length-1;
        while(l<=r){
            if(arr[l]+arr[r]==sum){
                System.out.println(arr[l]+" "+arr[r]);
                return;
            }
            else if(arr[l]+arr[r]>sum)
                r--;
            else
                l++;
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,9,2,8,10,11};
        sum(arr,21);
    }
}
