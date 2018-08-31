import java.util.ArrayList;
import java.util.List;

public class Predicate {

  public static void main(String[] args){
    List<String> configKeyList = new ArrayList<>();
    configKeyList.add("first_level");
    configKeyList.add("second_level");
    configKeyList.add("three_level");
    java.util.function.Predicate<String> shouldAConfigKey = (key) -> configKeyList.contains(key);
    System.out.println(shouldAConfigKey.test("name"));
    System.out.println(shouldAConfigKey.test("second_level"));
  }
}
