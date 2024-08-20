public class Median {
    public static float naive(int ar1[], int ar2[]){
        int temp[] = new int[ar1.length+ar2.length];
        int i=0,j=0,k=0;

        while(i<ar1.length && j<ar2.length && k<=temp.length/2){
            if(ar1[i]<ar2[j]){
                temp[k] = ar1[i];
                i++;k++;
            }
            else{
                temp[k] = ar2[j];
                j++;k++;
            }
        }

        while(i<ar1.length && k<=temp.length/2){
            temp[k] = ar1[i];
            i++;k++;
        }
        while(j<ar2.length && k<=temp.length/2){
            temp[k] = ar2[j];
            j++;k++;
        }

        if(temp.length%2==0){
            return (float)((temp[temp.length/2] + temp[(temp.length/2)-1])/2.0f);
        }
        else
            return (float)(temp[temp.length/2]);
    }

    static double efficient(int n, int m, int arr1[], int arr2[]) 
    {
        if(n>m){
            return efficient(m,n,arr2,arr1);
        }
        
        int low = 0, high = n;
        
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2 = ((n+m+1)/2) - mid1;
            
            int l1 = (mid1==0) ? Integer.MIN_VALUE : arr1[mid1-1];
            int l2 = (mid2==0) ? Integer.MIN_VALUE : arr2[mid2-1];
            
            int r1 = (mid1>=n) ? Integer.MAX_VALUE : arr1[mid1];
            int r2 = (mid2>=m) ? Integer.MAX_VALUE : arr2[mid2];
            
            if(l1<=r2 && l2<=r1){
                if((n+m) % 2 == 0){
                    return (double)(Math.max(l1,l2) + Math.min(r1,r2))/2;
                }
                else{
                    return (double)Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                high = mid1-1;
            }
            else{
                low = mid1+1;
            }
        }
        return 0.0f;
    }
    public static void main(String[] args) {
        int ar1[] = {1,2,3,5,6};
        int ar2[] = {4};
        // System.out.println(naive(ar1,ar2));
        System.out.println(efficient(5,1,ar1,ar2));
    }
}
