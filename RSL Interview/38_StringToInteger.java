class Solution{
    public static void main(String[] args) {
        String n = "345";
        stringToInteger(n);
    }

    static void stringToInteger(String n){
        int factor = 1;
        int ans = 0;
        for(int i=n.length()-1;i>=0;i--){
            ans += (n.charAt(i)-'0') * factor;
            factor *= 10;
        }
        System.out.println(ans);
    }
}