class Solution{
    public static void main(String[] args) {
        int year = 1883;
        int n = 15;
        nLeapYear(year, n);
    }

    static void nLeapYear(int year, int n){
        while(!isLeap(year)) year++;
        int count = 0;
        while(count < n){
            if( isLeap(year) ){
                System.out.println(year);
                count++;
            }
            year+=4;
        }
    }

    static boolean isLeap(int year){
        return ( ( (year%4==0) && (year%100!=0) ) || (year%400==0) );
    }
}