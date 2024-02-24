class Solution{
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countmincoins(n));
    }

    static int countmincoins(int n) {
        int rem = n%5;
        int temp = n;
        if (rem % 2 == 1) {
            temp = temp - 5;
        }
        System.out.println("temp = "+temp);
        int ans = (temp / 5) + (n - (temp / 5) * 5) / 2;
        return ans;
    }
}