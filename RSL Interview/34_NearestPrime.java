import java.util.*;
class Solution{
    public static void main(String[] args) {
        int N = 9;
        int []arr = nearestPrime(N);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] nearestPrime(int N){
        boolean isPrime[] = allPrimes();
        if(isPrime[N]){
            return new int[] {N};
        }
        int left = N-1;
        int right = N+1;
        while(left >= 0){
            if(isPrime[left] && isPrime[right]){
                return new int[]{left, right};
            }
            else if(isPrime[left]) return new int[] {left};
            else if(isPrime[right]) return new int[] {right};
            left--;
            right++;
        }
        return new int[] {-1};
    }

    static boolean[] allPrimes(){
        int last = 1000;
        boolean primeArr[] = new boolean[last];
        Arrays.fill(primeArr, true);
        for(int i=2;i*i < last;i++){
            if(primeArr[i]){
                for(int j=i*i;j<last;j+=i){
                    primeArr[j] = false;
                }
            }
        }
        return primeArr;
    }
}