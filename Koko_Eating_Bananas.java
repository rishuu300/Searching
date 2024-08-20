public class Koko_Eating_Bananas {
    public static int Solve(int N, int[] piles, int H) {
        int low = 0, high = Integer.MIN_VALUE;
        
        for(int i=0; i<N; i++){
            high = Math.max(high, piles[i]);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            
            int time = minTime(piles,mid);
            
            if(time <= H){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return low;
    }
    
    public static int minTime(int piles[], int bananas){
        int time = 0;
        
        for(int i=0; i<piles.length; i++){
            time += Math.ceil((double) piles[i]/bananas);
        }
        
        return time;
    }
    public static void main(String[] args) {
        
    }
}
