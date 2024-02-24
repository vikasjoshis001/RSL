package String;

public class String_percentage {
    public static void replace(String s){
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
    int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == 32 && (i+1 < n && arr[i+1]!=32))
                sb.append("%20");
            else
                sb.append(arr[i]);
        }
        // return sb.toString();
         System.out.print(sb.toString());

    }
    public static void main(String[] args) {
        String s = "yash korekar asish    ";
        replace(s);
        // System.out.print(replace(s));
        
    }
    
}
