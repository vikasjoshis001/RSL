class Solution{
    public static void main(String[] args) {
        String str = "1234";
        stoi(str);
    }

    static void stoi(String str){
        int res = 0;
        for(int i=0;i<str.length();i++){
            res = res * 10 + str.charAt(i) - '0';
        }
        System.out.println(res);
    }
}