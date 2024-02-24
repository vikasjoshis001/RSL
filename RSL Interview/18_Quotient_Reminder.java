class Solution{
    public static void main(String[] args) {
        int dividend = 11;
        int divisor = 3;
        int arr[] = find(dividend, divisor);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    static int[] find(int dividend, int divisor){
        return quotientReminder(dividend, divisor, 1, dividend);
    }

    static int[] quotientReminder(int dividend, int divisor, int start, int end){
        if(divisor == 0) System.out.println("Divisor Cant be Zero");
        if(start > end){
            return new int[] {0, dividend};
        }
        int mid = (start+end)/2;
        int n = dividend-divisor*mid;
        if(n >= divisor) start = mid+1;
        else if(n < 0) end = mid-1;
        else{
            if(n == divisor){
                mid++;
                n = 0;
            }
            return new int[] {mid, n};
        }

        return quotientReminder(dividend, divisor, start, end);
    }
}