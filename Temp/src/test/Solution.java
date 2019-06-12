package test;

import java.util.Date;

public class Solution {

  public static void main(String[] args){

      System.out.println("test:"+ StaticClass.getTime());
  }


  public static class StaticClass  {

      public static String getTime() {
          return new Date().toString();
      }
  }

    public class ClassTwo {

      public  String getTime() {
          return "two:"+new Date().toString();
      }
    }

}

class AnotherClass {

    public  void print() {
        System.out.println("Another class in a file");
    }
}