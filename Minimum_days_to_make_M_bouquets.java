public class Minimum_days_to_make_M_bouquets {
    public static int solve(int M, int K, int[] bloomDay) {
        long val=(long) M * K;
        if((val) > bloomDay.length){
            return -1;
        } 
        
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE, n = bloomDay.length;
        
        for(int i=0; i<n; i++){
            low = Math.min(low, bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            boolean isPossible = check(bloomDay,M,K,mid);
            if(isPossible){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
    
    public static boolean check(int bloomDay[], int bouquets, int K_flowers, int days){
        int counter = 0;
        
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= days){
                counter++;
            }
            else{
                counter -= (counter % K_flowers);
            }
        }
        
        return (counter/K_flowers) >= bouquets;
    }
    public static void main(String[] args) {
        
    }
}
