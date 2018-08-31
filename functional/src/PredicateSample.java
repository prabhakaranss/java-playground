import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {

  public static void main(String[] args){
    List<String> configKeyList = new ArrayList<>();
    configKeyList.add("first_level");
    configKeyList.add("second_level");
    configKeyList.add("three_level");
    Predicate<String> shouldAConfigKey = (key) -> configKeyList.contains(key);
    System.out.println(shouldAConfigKey.test("name"));
    System.out.println(shouldAConfigKey.test("second_level"));
  }
}
