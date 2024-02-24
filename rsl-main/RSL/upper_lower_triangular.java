public class upper_lower_triangular {
    static void sum(int mat[][],int r,int c){
        int i,j;
        int uppersum = 0;
        int lowersum = 0;

        for(i = 0; i <r; i++)
            for( j = 0; j < c;j++){
                if(i <= j){
                    uppersum += mat[i][j];
                }
            }
            System.out.println("upper sum"+ uppersum);


            for(i = 0; i <r; i++)
            for( j = 0; j < c;j++){
                if(j <= i){
                    lowersum += mat[i][j];
                }
            }
            System.out.print("upper sum"+ lowersum);
    
    }
        
        public static void main (String[] args)
        {
            int r = 3;
            int c = 3;
         
            /*giving the matrix*/
            int mat[][] = {{ 6, 5, 4 },
                            { 1, 2, 5 },
                            { 7, 9, 7 }};
                             
            /*calling the function*/
            sum(mat, r, c);
        }
    }
    
  
