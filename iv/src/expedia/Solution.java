package expedia;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args){
    //int[] arr = {1,2,3,4,5};
    int[] arr = {2,8,5,1,10};
    //System.out.println(solve(arr, 5));
    System.out.println(solve(5,arr,4,5,9));
    System.out.println(solve(5,arr,3,5,6));
    System.out.println(solve(5,arr,1,2,8));
  }
  
  static int solve(int[] arr, int n) {
    int sum = 0;
    sum = Arrays.stream(arr).map(intValue -> Arrays.stream(arr).map(value -> (int) Math.floor(value / intValue)).reduce(0, (first, second) -> first + second) )
        .reduce(0, (first, second) -> first + second);
    /*for (int x=0; x< n; x++) {
      int finalX = arr[x];
      sum += Arrays.stream(arr).map(value -> (int) Math.floor(value / finalX)).reduce(0, (first, second) -> first + second);

    }*/

    return sum;
  }

  static long solve(int N, int[] A, int L, int R, int P){
    long result = 0L;
    for (int x=L; x<= R; x++) {
      if (A[x-1] -P > 0) {
        result++;
      }
    }
    return result;
  }

}
