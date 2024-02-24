// input- { } } { }
// output - { } { } { }

// ())()()

public class completeParenthesis{
    public static void main(String[] args) {
        String s = "((((";
        System.out.println(completed(s));
    }

    static String completed(String ip){
        int br=0;
        
        StringBuilder sb = new StringBuilder();
        // if ')' 
        int ans=0;
        for(int i=0;i<ip.length();i++){
            if(ip.charAt(i)==')'){
//        ())
                br--;
            }
            else if(ip.charAt(i)=='(')br++;
            if(br<0){
                ans += Math.abs(br);
                br=0;
            }
        }
        while(ans-->0)sb.append('(');
        sb.append(ip);
        while(br-->0)sb.append(')');

        return sb.toString();
    }
}