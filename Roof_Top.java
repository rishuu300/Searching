public class Roof_Top {
    static int maxStep(int arr[]) {
        int count = 0, max = Integer.MIN_VALUE;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        
        return max;
    }
    public static void main(String[] args) {
        
    }
}
