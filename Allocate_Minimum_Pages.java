public class Allocate_Minimum_Pages {
    public static long findPages(int n, int[] arr, int m) {
        if(n<m){
            return -1;
        }
        
        int low = arr[0];
        int high = arr[0];
        
        for(int i=1; i<n; i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int student_count = count_students(arr,mid);
            if(student_count > m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
    public static int count_students(int arr[], int pages){
        int students = 1;
        long pages_count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(pages_count + arr[i] <= pages){
                pages_count += arr[i];
            }
            else{
                students++;
                pages_count = arr[i];
            }
        }
        
        return students;
    }
    public static void main(String[] args) {
        
    }
}
