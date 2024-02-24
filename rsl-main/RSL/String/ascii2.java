package String;

public class ascii2 {
    static char[] replaceSpaces(char[] s) {
        //count spaces;
        int spaces = 0;
        int i = 0;
        for ( i = 0; i < s.length; i++) {
          if (s[i] == ' ') spaces++;
        }
        // create new array with, spaces*2 + s.length
        char ans[] = new char[s.length + (spaces * 2)];
    
       
        int newindex = 0;
        for (int i = 0; i < s.length; i++) {
          if (s[i] == ' ') {
            ans[newindex++] = '%';
            ans[newindex++] = '2';
            ans[newindex++] = '0';
          } else {
            ans[newindex++] = s[i];
          }
        }
        return ans;
        
      
    
}
public static void main(String[] args) {
    char[] s = "Mr John Smith ".toCharArray();
    s = replaceSpaces(s);
    for (int i = 0; i < s.length; i++)
    System.out.print(s[i]);
}
}
