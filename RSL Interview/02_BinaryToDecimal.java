import java.util.*;

class Solution{
    public static void main(String[] args) {
        int num = 10101001;
        String str = "10101001";
        strToDecimal(str);
        // toDecimal(num);
    }

    static void toDecimal(int num){
        int base = 1;
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int ld = temp%10;
            sum = sum + (ld * base);
            temp/=10;
            base*=2;
        }
        System.out.println(sum);
    }

    static void strToDecimal(String str){
        int base = 1;
        int decimal = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == '1'){
                decimal+=base;
            }
            base*=2;
        }
        System.out.println(decimal);
    }
}