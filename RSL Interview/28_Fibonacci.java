class Solution{
     
    public static void main(String[] args) {
        int N = 10;
        fibonacciNumbers(N);
    }

    static void fibonacciNumbers(int N){
        int fib[] = new int[N];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2;i<N;i++){
            fib[i] = fib[i-1]+fib[i-2];
        }

        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i]);
        }
    }
}