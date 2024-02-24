import javax.xml.stream.events.StartDocument;

class Solution{
    public static void main(String[] args) {
        int n = 10;
        printRAT(n);
    }

    static void printRAT(int n){
        int lineNo = 1;
        int starCount = 0;
        while(lineNo <= n){
            if(starCount < lineNo){
                System.out.print("* ");
                starCount++;
                continue;
            }

            if(starCount == lineNo){
                System.out.println();
                lineNo++;
                starCount = 0;
            }
        }
    }
}