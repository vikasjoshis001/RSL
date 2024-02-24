class Solution{
    public static void main(String[] args) {
        String str = "amazon";
        System.out.println(firstNonRepeating(str));
    }
     static Character firstNonRepeating(String str){
        int freq[] = new int[27];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch-'a'] == 1) return ch;
        }
        return '0';
     }
}