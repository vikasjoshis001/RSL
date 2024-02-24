class Solution{
    public static void main(String[] args) {
        int mat[][] = { { 6, 5, 4 },
                { 1, 2, 5 },
                { 7, 9, 7 } };
        
        System.out.println(sumOfLower(mat));
    }

    static int sumOfLower(int [][]mat){
        int r = mat.length;
        int c = mat[0].length;
        int lowerSum = 0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j <= i){
                    lowerSum += mat[i][j];
                }
            }
        }

        return lowerSum;
    }
}