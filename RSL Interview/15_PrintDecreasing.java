class Solution{
    public static void main(String[] args) {
        int num = 589456;
        printNums(num);
    }

    static void printNums(int n){
        int base = 1;
        int ans = 0;
        while(ans != n){
            base *= 10;
            ans = n%base;
            System.out.println(ans);
        }
    }
}