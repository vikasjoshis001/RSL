class Solution{
    public static void main(String[] args) {
        String str = "vikasjoh";
        System.out.println(uniqueString(str));
    }

    static boolean uniqueString(String str){
        int checker = 0;
        for(int i=0;i<str.length();i++){
            int bitIndex = str.charAt(i) - 'a';
            if((checker & (1<<bitIndex)) > 0) return false;
            checker = checker | (1<<bitIndex);
        }
        return true;
    }
}