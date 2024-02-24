class Solution{
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much.hello";
        changeAlternate(str);
    }

    static void changeAlternate(String str){
        String result = "";
        int count = 0;
        String words = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '.' && count%2 == 1){
                count++;
                result = result + "abc.";
                words="";
            }
            else if(ch == '.' && count%2 == 0){
                count++;
                result = result + words + '.';
                words = "";
            }
            else{
                words+=ch;
            }
        }
        if (count % 2 == 1) {
            count++;
            result = result + "abc";
            words = "";
        } else if (count % 2 == 0) {
            count++;
            result = result + words;
            words = "";
        }
        System.out.println(result);
    }
}