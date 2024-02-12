import java.rmi.dgc.VMID;
import java.util.Arrays;
public class Uniqueness {
    public static boolean unique1(int[] data) {
        int n = data.length;
        for (int j=0; j < n-1; j++)
            for (int k=j+1; k < n; k++)
                if (data[j] == data[k])
                    return false;                    // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }

    /** Returns true if there are no duplicate elements in the array. */
    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);   // make copy of data
        Arrays.sort(temp);                     // and sort the copy
        for (int j=0; j < n-1; j++)
            if (temp[j] == temp[j+1])            // check neighboring entries
                return false;                      // found duplicate pair
        return true;                           // if we reach this, elements are unique
    }
    public static boolean binarySearch(int[]data, int target, int low, int high){
        if(low>high){
            return false;
        }else{
            int mid = (low + high)/2;
            if(target == data[mid])
                return true;
            else if (target<data[mid]) {
                return binarySearch(data, target, low, mid-1);
            }else
                return binarySearch(data, target, mid - 1, high);
        }
    }
    public static void main(String[] args) {
        int low = 1;
        int high = 10000;
        while (low <= high) {
            int mid = (low + high)/2;
            int[]data = new int [mid];
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long runtime = endTime - startTime;
            unique1(data);
            if (runtime < 60000) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            System.out.println("Maximum size of n for unique1 algorithm within one minute: " + mid);
        }

        low = 1;
        high = 10000;
        while (low <= high) {
            int mid = (low + high)/2;
            int[]data = new int [mid];
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long runtime = endTime - startTime;
            unique2(data);
            if (runtime < 60000) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            System.out.println("Maximum size of n for unique2 algorithm within one minute: " + mid);

        }
    }

}
