class Solution{
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7};
        sumOfPrimes(nums);
    }

    static void sumOfPrimes(int []nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        for(int i=2;i<n-1;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}