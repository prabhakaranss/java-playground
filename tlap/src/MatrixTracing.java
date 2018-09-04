public class MatrixTracing {

  public static void main(String[] args) {
    System.out.println("traceable paths:"+traceCount(2,4));
  }

  private static int traceCount(int maxRow, int maxCol) {
  return traceCount(1,1,maxRow,maxCol);
  }

  private static int traceCount(int row,int col, int maxRow, int maxCol) {

    if (row == maxRow && col == maxCol) {
      return 1;
    }
    int count = 0;
    if (row < maxRow) {
      count += traceCount(row+1,col,maxRow,maxCol);
    }
    if (col < maxCol) {
      count +=  traceCount(row, col+1, maxRow, maxCol);
    }
    return count;
  }
}
