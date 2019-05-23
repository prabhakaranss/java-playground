import java.util.Date;

public class Solution {

  public static void main(String[] args){

      System.out.println("test:"+ StaticClass.getTime());
  }


  protected static class StaticClass  {

      public static String getTime() {
          return new Date().toString();
      }
  }

    protected class StaticClassTwo {

      public  String getTime() {
          return "two"+new Date().toString();
      }
    }

}
