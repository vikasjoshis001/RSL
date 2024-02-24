class Solution{
    public static void main(String[] args) {
        String str = "sample string";
        maxOcurrence(str);
    }

    static void maxOcurrence(String str){
        int freq[] = new int[256];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }

        int max = Integer.MIN_VALUE;
        char result = ' ';
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)] > max){
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println(result);
    }
}