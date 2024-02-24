public class string_to_integer {
    static void convert(String s){
        // int num = 0;
        // int n = s.length();
        // for(int i = 0;i<n;i++)
        //     num = num * 10 + ((int)s.charAt(i) - 48);
        //     System.out.print(num);
        int answer = 0, factor = 1;
    for (int i = s.length()-1; i >= 0; i--) {
        answer += (s.charAt(i) - '0') * factor;
        factor *= 10;
      
    }
    System.out.print(answer);
        
    }
    public static void main(String[] args) 
{ 
    // Given string of number 
    String s = "3"; 
  
    // Function Call 
    convert(s); 
} 
    
}
