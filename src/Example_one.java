public class Example_one {
    /** Returns the sum of the integers in given array. */
    public static int example1(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       // loop from 0 to n-1
            total += arr[j];
        return total;
    }
    //linear method, for each n increase, j will also increase , the total result
    //F(j) = n
    //will be O(n)


    /** Returns the sum of the integers with even index in given array. */
    public static int example2(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j += 2)    // note the increment of 2
            total += arr[j];
        return total;
    }
    //linear method, for each n increase, j will increase by 2, the total result
    //F(j) = 2(n)
    //will be O(2n) ==> O(n)  ignore constants

    /** Returns the sum of the prefix sums of given array. */
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       // loop from 0 to n-1
            for (int k=0; k <= j; k++)    // loop from 0 to j
                total += arr[j];
        return total;
    }
    //Quadratic method, for each n increase, j increase (the first loop => n),
    //as j increase, k will also increase (the second loop k <= j will be the second n),
    //F(j) = n * k
    //then the format will become n * n => n^2  ==>  O(n^2)

    /** Returns the sum of the prefix sums of given array. */
    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j=0; j < n; j++) {     // loop from 0 to n-1
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }
    //linear method, for each n increase, j will also increase ==> prefix += arr[j] which is
    // O(n), total += prefix   == arr[j]
    //the total resul will be O(n)

    /** Returns the number of times second array stores sum of prefix sums from first. */
    public static int example5(int[] first, int[] second) { // assume equal-length arrays
        int n = first.length, count = 0;
        for (int i=0; i < n; i++) {     // loop from 0 to n-1
            int total = 0;
            for (int j=0; j < n; j++)     // loop from 0 to n-1
                for (int k=0; k <= j; k++)  // loop from 0 to j
                    total += first[k];
            if (second[i] == total) count++;
        }
        return count;
    }
    //cubic method, i increase as n increase (first loop)
    //As n increase, j increase (second loop)
    //when j increase k will also increase ( third loop)
    //total += sum[k]
    //so the run time will invoke all three loop
    // ==> n * n * n  ==> O(n^3)
}

