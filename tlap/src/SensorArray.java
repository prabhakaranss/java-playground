public class SensorArray {

  public static void main(String[] args) {
    int[] array1 = {-1, 3, 4, -8, 123};
    int[] array2 = {-15, 6, 4, -2, -10};
    System.out.println("DIFF-TOTAL:" + findDiffIterative(array1, array2, 5));
    System.out.println("DIFF-TOTAL:" + findDiffRecursive(array1, array2, 5));
  }

  private static int findDiffRecursive(int[] array1, int[] array2, int index) {
    return index == 0 ? 0 : Math.abs(Math.abs(array1[index - 1]) - Math.abs(array2[index - 1])) + findDiffRecursive(array1, array2, index - 1);
  }

  private static int findDiffIterative(int[] array1, int[] array2, int size) {
    int diffTotal = 0;
    for (int i = 0; i < size; i++) {
      int diff = Math.abs(Math.abs(array1[i]) - Math.abs(array2[i]));
      diffTotal += diff;
    }
    return diffTotal;
  }
}
