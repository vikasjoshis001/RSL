public class DETECT_PATTERN {
    static int pattern(String str){
        char last = str.charAt(0);
        int i = 1,counter = 0;
        while(i < str.length()){
            if(str.charAt(i) == '0' && last == '1'){
                while(str.charAt(i) == '0')
                    i++;

                if(str.charAt(i) == '1')
                    counter++;
            }

            last = str.charAt(i);
            i++;

        }
        return counter;
    }
    public static void main (String[] args)
    {
        String str = "1001ab010abc10101001";
        System.out.println(pattern(str));
         
    }
}
