class Solution{
    public static void main(String[] args) {
        String str = "aeio  uax  zy";
        vowelConsonant(str);
    }

    static void vowelConsonant(String str){
        int freq[] = new int[256];
        int vowel = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                freq[ch]++;
            }
            else{
                vowel++;
            }
        }
        for(int i=0;i< 256;i++){
            if(freq[i] > 0){
                System.out.println((char) (i) + " = "+ freq[i]);
            }
        }
        System.out.println("Vowels = "+vowel);
    }
}