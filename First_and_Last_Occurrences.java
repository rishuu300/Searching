import java.util.ArrayList;

public class First_and_Last_Occurrences {
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> al = new ArrayList<>(2);
        al.add(-1);
        al.add(-1);
        int low = 0, high = n-1;
        
        while(low<=high){
            if(arr[low] == x && arr[high] == x){
                al.add(0,low);
                al.add(1,high);
                break;
            }
            
            if(arr[low] != x) low++;
            if(arr[high] != x) high--;
        }
        
        return al;
    }
    public static void main(String[] args) {
        
    }
}
