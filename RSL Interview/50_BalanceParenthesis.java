class Solution{
    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        System.out.println(balanceParenthesis(exp));
    }

    static String balanceParenthesis(String exp){
        int freq[] = new int[3];
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch == '(') freq[0]++;
            if(ch == '{') freq[1]++;
            if(ch == '[') freq[2]++;
            if(ch == ')'){
                if(freq[0] < 1) return "Unbalanced";
                freq[0]--;
            }
            if(ch == '}') {
                if (freq[1] < 1)
                    return "Unbalanced";
                freq[1]--;
            }
            if(ch == ']') {
                if (freq[2] < 1)
                    return "Unbalanced";
                freq[2]--;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0){
                return "Unbalanced";
            }
        }
        return exp;
    }
}