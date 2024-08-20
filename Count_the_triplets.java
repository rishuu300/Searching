//Given an array Arr consisting of N distinct integers. 
//The task is to count all the triplets such that sum of two elements equals the third element.

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;


public class Count_the_triplets {
    public static int Space_Efficient(int arr[], int n) {
        Arrays.sort(arr);
        int tripletCount = 0;
        for(int i=0; i<n; i++) {
            
            int low = 0; int high = n-1;
            
            while(low<high){
                int sum = arr[low] + arr[high];
                
                if(sum==arr[i]){
                    tripletCount++;
                    low++;
                    high--;
                }
                else if(sum < arr[i]){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return tripletCount;
    }
    
    public static int Time_Efficient(int arr[], int n){
        Set<Integer> s = new HashSet<>();
        int count = 0;
        
        for(int i=0; i<n; i++){
            s.add(arr[i]);
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(s.contains(arr[i]+arr[j])){
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
