package String;

public class string_dot {
   static void reverseWords(String S)
   {
       // code here 
       int n=S.length();
       char ch[]=S.toCharArray();
       int start=0;
       for(int end=0;end<n;end++)
       {
           if(ch[end]=='.')
           {
               reverse(ch,start,end-1);
               start=end+1;
           }
       }
        reverse(ch,start,n-1);
         reverse(ch,0,n-1);
       String str=new String(ch);
    //    return str;
       System.out.println(str);
   }
   static void reverse(char ch[],int low,int high)
   {
       while(low<high)
       {
           char temp=ch[low];
           ch[low]=ch[high];
           ch[high]=temp;
           low++;
           high--;
       }
   }
   public static void main(String[] args) {
    String s = "i.like.this.program.very.much";
    reverseWords(s);

   }
}
