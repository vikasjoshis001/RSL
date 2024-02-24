class Solution{
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        frequencyOfChars(str);
    }

    static void frequencyOfChars(String str){
        int freq[] = new int[27];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a'] != 0){
                System.out.println(str.charAt(i) + " = " + freq[str.charAt(i) - 'a']);
                freq[str.charAt(i)-'a'] = 0;
            }
        }
    }
}