package String;

public class ascii_sol {
    public static void main(String[] args) {
        String s = "RSL Nighali Pahije Bhava";
    
        // solution starts
        char[] st = s.toCharArray();
        st = replaceSpaces(st);
    
        for (char c : st) {
          System.out.print(c);
        }
      }
    
      static char[] replaceSpaces(char[] s) {
        //count spaces;
        int spaces = 0;
        for (int i = 0; i < s.length; i++) {
          if (s[i] == ' ') spaces++;
        }
        // create new array with, spaces*2 + s.length
        char ans[] = new char[s.length + (spaces * 2)];
    
        // traverse
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
    
    
}
