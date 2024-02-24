class Solution{
    public static void main(String[] args) {
        String str = ")(()";
        completeParanthesis(str);
    }

    static void completeParanthesis(String str){
        int n = str.length();
        int index = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == ')') index--;
            else if(ch == '(') index++;
            if(index < 0){
                ans += Math.abs(index);
                index = 0;
            }
        }

        String res = "";
        while(ans > 0){
            res+='(';
            ans--;
        }
        res+=str;
        while(index > 0){
            res+=')';
            index--;
        }

        System.out.println(res);
    }
}