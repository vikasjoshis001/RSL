public class binary2 {
    private static void binary(int[] marks, int num,int n) {
        int l = 0, hi = marks.length - 1, mid = 0;
        while (l < hi) {
          mid = l + (hi - l) / 2;
          if (marks[mid] == num) {
            System.out.println("Rank is:" + (marks.length - mid));
            return;
          } else if (marks[mid] > num) {
            hi = mid;
          } else {
            l = mid + 1;
          }
        }
        System.out.println("Raank is:" + (marks.length - mid));
      }
    public static void main(String[] args) {
        int marks[] ={39, 38, 38, 36, 34, 31, 28};
        int n = 7;
        int num = 36;
        binary(marks, num,7);
    }
}
