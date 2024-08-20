public class Find_Nth_root_of_M {
    public int NthRoot(int n, int m){
        int low = 0, high = m;
        
        while(low<=high){
            int mid = (low+high)/2;
            int root = (int)Math.pow(mid,n);
            
            if(root == m){
                return mid;
            }
            else if(root > m){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
