class Solution{
    public static void main(String[] args) {
        int N = 20;
        System.out.println(evenFibonacciSum(N));
    }

    static int evenFibonacciSum(int N){
        int c = 0;
        int a = 0;
        int b = 1;
        int sum = 0;
        while(c <= N){
            if (c == N) {
                return N;
            }
            if(c%2 == 0){
                sum+=c;
            }
            c = a+b;
            a = b;
            b = c;
        }
        return sum;
    }
}