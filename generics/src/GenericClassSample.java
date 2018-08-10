import java.util.Date;

public class GenericClassSample {

  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    System.out.println(new GenericGetInstance<String>(String.class).createInstance().getClass());
    System.out.println(new GenericGetInstance<Date>(Date.class).createInstance().getClass());
  }

}

class GenericGetInstance<T> {
  Class classType;
  GenericGetInstance(Class classType) {
    this.classType = classType;
  }

  public T createInstance() throws IllegalAccessException, InstantiationException {
    return (T) this.classType.newInstance();
  }
}
