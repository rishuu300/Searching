import java.util.HashSet;
import java.util.Set;

public class Pythagorean_Triplet {
    boolean checkTriplet(int[] arr, int n) {
        Set<Integer> set = new HashSet<Integer>() ;
        for(int i=0 ; i<n ; i++){
            set.add(arr[i]*arr[i]);
        }
        for(int i: set){
            for(int j: set){
                if(set.contains(i+j)){
                    return true ;
                }
            }   
        }
        return false ;
    }
    public static void main(String[] args) {
        
    }
}
