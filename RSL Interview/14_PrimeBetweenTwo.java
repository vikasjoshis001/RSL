class Solution{
    public static void main(String[] args) {
        int a = 1;
        int b = 20;
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if(n == 2) return true;
        for(int i=2;i<n-1;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}