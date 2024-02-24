class Solution{
    public static void main(String[] args) {
        int N = 9;
        int arr[] = nearestPrime(N);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] nearestPrime(int N){
        boolean isPrime[] = allPrimes(N);
        int left = N-1;
        int right = N+1;
        while(left >= 0){
            if(isPrime[left] && isPrime[right]) return new int[] {right, left};
            else if(isPrime[left]) return new int[] {left};
            else if(isPrime[right]) return new int[] {right};
            left++;
            right--;
        }
        return new int[] {};
    }

    static boolean[] allPrimes(int N){
        int last = 10005;
        boolean primesNums[] = new boolean[last];
        for (int i = 0; i < last; i++) {
            primesNums[i] = true;
        }
        primesNums[0] = false;
        primesNums[1] = false;
        for(int i=2;i*i<last;i++){
            if(primesNums[i]){
                for(int j=i*i;j<last;j+=i){
                    primesNums[j] = false;
                }
            }
        }
        return primesNums;
    }
}