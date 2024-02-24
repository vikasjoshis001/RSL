class Solution{
    public static void main(String[] args) {
        String str = "12abc3";
        System.out.println(uniqueString(str));
    }

    static boolean uniqueString(String str){
        int checker1 = 0;
        int checker2 = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int bitIndex;
            if((int) ch >= 48 && (int) ch <= 58 ){
                bitIndex = ch - '0';
                if ((checker1 & (1 << bitIndex)) > 0)
                    return false;
                checker1 = checker1 | (1 << bitIndex);
            }
            else{
                bitIndex = ch - 'a';
                if ((checker2 & (1 << bitIndex)) > 0)
                    return false;
                checker2 = checker2 | (1 << bitIndex);
            }

            
        }
        return true;
    }
}