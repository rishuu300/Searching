public class Square_Root {
    static long floorSqrt(long x){
	    int res = 0;
		int low = 0;
		int high = (int)x;
		
		while(low<=high){
		    int mid = (low+high)/2;
		    
		    if(mid*mid == x){
		        return mid;
		    }
		    else if(mid*mid > x){
		        high = mid-1;
		    }
		    else{
		        low = mid+1;
		        res = mid;
		    }
		}
		
		return res;
	}
    public static void main(String[] args) {
        System.out.println(floorSqrt(5));
    }
}
