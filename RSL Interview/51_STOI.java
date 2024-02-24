class Solution{
    public static void main(String[] args) {
        String num = "789f65";
        System.out.println(stoi(num));
    }

    static int stoi(String num){
        int ans = 0;
        if(num.length() == 0){
            return 0;
        }
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            if (((int) ch >= 97 && (int) ch <= 122) || ((int) ch >= 65 && (int) ch <= 90)) {
                return 0;
            }
            ans = ans * 10 + ch - '0';
        }
        return ans;
    }
}