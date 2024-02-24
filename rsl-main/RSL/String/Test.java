package String;
public class Test {
    // public void replaceSpaces(String s, int length) {
    //     char[] str = s.toCharArray();
    //     int spaceCount = 0, newLength = 0, i = 0;

    //     for(i = 0; i < length; i++) {
    //         if (str[i] == ' ') 
    //             spaceCount++;
    //     }

    //     newLength = length + (spaceCount * 2);
    //     // str[newLength] = '\0';
    //     for(i = length - 1; i >= 0; i--) {
    //         if (str[i] == ' ') {
    //             str[newLength - 1] = '0';
    //             str[newLength - 2] = '2';
    //             str[newLength - 3] = '%';
    //             newLength = newLength - 3;
    //         }
    //         else {
    //             str[newLength - 1] = str[i];
    //             newLength = newLength - 1;
    //         }
    //     }
    //     System.out.println(str);
    // }

    // public static void main(String[] args) {
    //     Test tst = new Test();
    //     String s = "RSL Nighali Pahije Bhava";
    //     int length = 21;
    //     tst.replaceSpaces(s, length);  
    // }
    public static void replaceSpaces(char[] str,int length){
        int spaceCount = 0,newLength=0,i=0;
        
        //first scan
        for (i=0;i<length;i++) {
        if(str[i]==' '){
        spaceCount++;
        }
        }
        newLength = length + 2 * spaceCount;
        
        char[] newArray = new char[newLength+1];
        newArray[newLength] = '\0';
        int newArrayPosition = 0;
        
        //second scan
        for (i=0;i<length;i++) {
        if(str[i]==' '){
        newArray[newArrayPosition] = '%';
        newArray[newArrayPosition+1] = '2';
        newArray[newArrayPosition+2] = '0';
        newArrayPosition = newArrayPosition+3;
        }
        
        else{
        newArray[newArrayPosition] = str[i];
        newArrayPosition++;
        }
        }
        System.out.println(newArray);
        }
        public static void main(String[] args) {
            
        }
}