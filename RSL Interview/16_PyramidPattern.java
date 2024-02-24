class Solution{
    public static void main(String[] args) {
        int n = 5;
        printPyramid(n);
    }

    static void printPyramid(int n){
        for(int i=1;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}