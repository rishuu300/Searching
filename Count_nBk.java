import java.util.HashMap;

public class Count_nBk {
    public int countOccurence(int[] arr, int n, int k) 
    {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
            
            if(hm.get(i) == (n/k)+1){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        
    }
}
