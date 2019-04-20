import java.util.Arrays;

public class Solution {

  public static void main(String[] args){

    System.out.println(getTotalX(new int[]{2,4}, new int[]{16,32,96}));
  }

  static int getTotalX(int[] a, int[] b) {
    int result = 0;
    for (int i = a[a.length-1]; i<= b[0] ; i++) {

      int finalI = i;
      if (Arrays.stream(a).allMatch(item -> finalI % item == 0)
            && Arrays.stream(b).allMatch(item -> item % finalI == 0 )) {
        result++;
      }
    }
    return result;
  }







}
