class Solution{
    public static void main(String[] args) {
        String str1 = "VIKSA";
        String str2 = "KASVI";
        System.out.println(isRotation(str1, str2));
    }

    static boolean isRotation(String str1, String str2){
        // if(str1.length() != str2.length()) return false;
        // char ch = str2.charAt(0);
        // if(str1.indexOf(ch) == -1) return false;
        // return true;
        int n = str1.length();
        String ans = str1 + str1;
        for(int i=0;i<n;i++){
            if(str2.equals(ans.substring(i, n+i))){
                return true;
            }
        }
        return false;
    }
}