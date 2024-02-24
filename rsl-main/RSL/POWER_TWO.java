class POWER_TWO{
    static boolean isPowerofTwo(int n)
    {
        int cnt = 0;
        if( n == 1)
        return false;
        while (n > 0) {
            if ((n & 1) == 1) {
                cnt++; // if n&1 == 1 keep incrementing cnt
                // varibale
            }
            n = n >> 1; // keep dividing n by 2 using right
                        // shift operator
        }
        if (cnt == 1) {
            // if cnt = 1 only then it is power of 2
            return true;
        }
        return false;
}
public static void main(String[] args) {
    int arr[] = { 2,3,1,4,8};
    int count = 0;
    
    int n = 5;

    for(int i = 0;i<5 ;i++){
        if(isPowerofTwo(arr[i])){
            count++;
        }
    }
    System.out.println(count);
}
}