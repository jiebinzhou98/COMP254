public class exercise_one {
    static int productSum(int m, int n)
    {
        //anything x 1 = itself
        if(n == 1)
        {
            return m;
        }
        //n < m, dont, just do the mutiplication
        if(m < n){
            return productSum(n,m);
        } else if (n!=0) {
            //recursion, when n >m, let n - 1 and m + the sum of n * m
            return (m + productSum(m, n-1));
        }
        else {
            //n or m is equal to 0
            return 0;
        }
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        System.out.println(productSum(m,n));
    }
}
