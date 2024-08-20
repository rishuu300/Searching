public class Left_Index{
    public static void leftIndex(int arr[]){
        int leftMin = 0; int rightMin = 0;
        int leftMax = 0; int rightMax = 0;
        int min = arr[0]; int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                rightMin = leftMin = i;
                min = arr[i];
            }
            else if(arr[i]==min){
                rightMin = i;
            }

            if(arr[i]>max){
                leftMax = rightMax = i;
                max = arr[i];
            }
            else if(arr[i]==max){
                rightMax = i;
            }
        }
        System.out.println("Minimum Element - "+min+", Index = Left - "+leftMin+", Right - "+rightMin);
        System.out.println("Maximum Element - "+max+", Index = Left - "+leftMax+", Right - "+rightMax);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 2, 1, 5, 6, 5};
        leftIndex(arr);
    }
}