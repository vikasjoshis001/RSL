class Solution{
    public static void main(String[] args) {
        int N = 21;
        System.out.println(fibonacciVariation(N));
    }

    static int fibonacciVariation(int N){
        int a = 0;
        int b = 1;
        int sum = 0;
        int c = a+b;
        while(c <= N){
            if(c == N){
                return c;
            }
            else{
                if(c%2 == 0) sum+=c;
                a = b;
                b = c;
                c = a + b;
            }
        }
        return sum;
    }
}