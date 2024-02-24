class Solution{
    public static void main(String[] args) {
        String str = "I.Like";
        reverseString(str);
    }

    static void reverseString(String str){
        int start = 0;
        int end = str.length()-1;
        char []charArr = str.toCharArray();
        while(start < end){
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
        System.out.println(String.valueOf(charArr));
    }
}