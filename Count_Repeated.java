public class Count_Repeated {
    public static void count(int arr[]){
        int l=0; int h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>=(arr[0]+mid))
               l = mid+1;
            else
                h = mid-1;
        }
        int freq = (arr.length)-(arr[arr.length-1]-arr[0]);
        System.out.println("Frequence - "+freq);
        System.out.println("Element - "+arr[l]);
    }
    public static void main(String[] args) {
        int arr[] = {6,7,7,8,9};
        count(arr);
    }
}
