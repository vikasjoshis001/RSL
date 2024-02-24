import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int N = 25;
        allPrimes(N);
    }

    static void allPrimes(int N){
        boolean primeArr[] = new boolean[N+1];
        Arrays.fill(primeArr, true);
        primeArr[0] = false;
        primeArr[1] = false;
        for(int i=2; i*i<=N;i++){
            if(primeArr[i]){
                for(int j=i*i;j<=N;j+=i){
                    primeArr[j] = false;
                }
            }
        }

        for(int i=0;i<N;i++){
            if(primeArr[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}