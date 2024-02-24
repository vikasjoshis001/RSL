class Solution{
    public static void main(String[] args) {
        int arr[] = {2,3,1,4,8};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(isPowerOfTwo(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isPowerOfTwo(int n){
        if(n == 0) return false;
        while(n > 1){
            if(n%2 == 1) return false;
            n /= 2;
        }
        return true;
    }
}