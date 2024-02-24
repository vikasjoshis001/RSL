class Solution{
    public static void main(String[] args) {
        int N = 2020;
        isLeapYear(N);
    }

    static void isLeapYear(int N){
        String isLeapYear = "NO";
        if(N%4 == 0){
            isLeapYear = "YES";
            if(N%100 == 0){
                if(N%400 == 0){
                    isLeapYear = "YES";
                }
                else{
                    isLeapYear = "NO";
                }
            }
        }
        System.out.println(isLeapYear);
    }
}