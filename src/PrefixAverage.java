import java.util.Arrays;
class PrefixAverage {

    /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
    public static double[] prefixAverage1(double[] x) {
        int n = x.length;
        double[] a = new double[n];    // filled with zeros by default
        for (int j=0; j < n; j++) {
            double total = 0;            // begin computing x[0] + ... + x[j]
            for (int i=0; i <= j; i++)
                total += x[i];
            a[j] = total / (j+1);        // record the average
        }
        return a;
    }

    /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
    public static double[] prefixAverage2(double[] x) {
        int n = x.length;
        double[] a = new double[n];    // filled with zeros by default
        double total = 0;              // compute prefix sum as x[0] + x[1] + ...
        for (int j=0; j < n; j++) {
            total += x[j];               // update prefix sum to include x[j]
            a[j] = total / (j+1);        // compute average based on current sum
        }
        return a;
    }
    public static void main(String[] args) {
        int n = 5000;
        int trials = 5;
        try{
            if(args.length>0)
                trials = Integer.parseInt(args[0]);
            if(args.length>1)
                n = Integer.parseInt(args[1]);
        }catch (NumberFormatException e){ }
        int start = n;
        System.out.println("Testing repeat1: ");
        for(int t =0; t<trials; t++){
            long startTime = System.currentTimeMillis();
            double[] inputArray = new double[n];
            for(int i =0; i<n; i++){
                inputArray[i] = n;
            }
            prefixAverage1(inputArray);
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;
            System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
            n *= 2;
        }
        System.out.println("Testing repeat2: ");
        for(int t =0; t<trials; t++){
            long startTime = System.currentTimeMillis();
            double[] inputArray = new double[n];
            for(int i =0; i<n; i++){
                inputArray[i] = n;
            }
            prefixAverage2(inputArray);
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;
            System.out.println(String.format("n: %9d took %12d milliseconds", n, elapsed));
            n *= 2;
        }

    }
}