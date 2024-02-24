class Solution{
    public static void main(String[] args) {
        String str = "geeks for geeks";
        replaceString(str);
    }

    static void replaceString(String str){
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                result+="%?";
            }
            else{
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
