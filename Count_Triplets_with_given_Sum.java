import java.util.HashSet;

public class Count_Triplets_with_given_Sum {
    public static void findTriplets(int arr[], int n, int sum){
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int x = sum - (arr[i] + arr[j]);
                if (s.contains(x))
                    System.out.printf(
                        "%d %d %d\n", x, arr[i], arr[j]);
                else
                    s.add(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
