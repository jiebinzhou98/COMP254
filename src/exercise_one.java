public class exercise_one {
    static int productSum(int m, int n)
    {
        if(m < n){
            return productSum(n,m);
        } else if (n!=0) {
            return (m + productSum(m, n-1));
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        System.out.println(productSum(m,n));
    }
}
