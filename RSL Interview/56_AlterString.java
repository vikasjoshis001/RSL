class Solution{
    public static void main(String[] args) {
        String str = "ab---cd---edf--";
        reverseString(str);
    }

    static void reverseString(String str){
        int count = 0;
        char s[] = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            if(s[i] != '-'){
                if(s[count] == '-'){
                    char temp = s[i];
                    s[i] = s[count];
                    s[count] = temp;
                }
                count++;
            }
        }
        System.out.println(String.valueOf(s));
    }
}