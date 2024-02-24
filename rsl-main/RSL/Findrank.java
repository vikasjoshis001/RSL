class Findrank{
    public static void main(String[] args) {
        int marks[] = {40,39,38,38,38,38,38,35,34,33,32,31};
        int target = 38;
        
       System.out.println(giverank(marks,target));
        
    }

    private static int giverank(int[]marks, int target){
        int rank=1;
        for(int i=0;i<marks.length;i++){
            if(marks[i]>target){
                if(i+1<marks.length && marks[i]==marks[i+1]){
                    continue;
                }
                else{
                    rank++;
                }
            }
            else break;
        }
        return rank;

    }
}