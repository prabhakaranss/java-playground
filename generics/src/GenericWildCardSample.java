import java.util.ArrayList;
import java.util.List;

public class GenericWildCardSample {

  public static void main(String[] args) {
    List<ClassA> listA = new ArrayList<>();
    listA.add(new ClassA());
    listA.add(new ClassB());
    listA.add(new ClassC());
    print(listA);
    System.out.println("===================================");
    List<ClassB> listB = new ArrayList<>();
    listB.add(new ClassB());
    listB.add(new ClassBChild());
    printSuper(listB);
    System.out.println("===================================");
    List<Object> listObj = new ArrayList<>();
    listObj.add(new ClassB());
    listObj.add(new ClassBChild());
    printSuper(listObj);
    System.out.println("===================================");
    printUnknown(listObj);
    printUnknown(listA);


  }

  private static void printSuper(List<? super ClassB> list) {
    list.forEach( classA -> System.out.println(classA.getClass()));
  }

  private static void print(List<? extends ClassA> list) {
    list.forEach(ClassA::printMessage);
  }

  private static void printUnknown(List<?> list) {
    list.forEach( classA -> System.out.println(classA.getClass()));
  }
}

class ClassA {

   String getMessage() {
    return "printing from ClassA";
  }

  public void printMessage() {
    System.out.println(getMessage());
  }
}

class ClassB extends ClassA{

   String getMessage() {
    return "printing from ClassB";
  }

  public void printMessage() {
    System.out.println(getMessage());
  }
}

class ClassC extends ClassA{
  String getMessage() {
    return "printing from ClassC";
  }

  public void printMessage() {
    System.out.println(getMessage());
  }
}

class ClassBChild extends ClassB {
  String getMessage() {
    return "printing from ClassBChild";
  }
}
