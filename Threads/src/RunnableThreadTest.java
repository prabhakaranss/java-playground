public class RunnableThreadTest {
  public static void main(String[] args) {
    new Thread(new MyRunnable("one")).start();
    new Thread(new MyRunnable("two")).start();
    new Thread(new MyRunnable("three")).start();
    new Thread(new MyRunnable("four")).start();
    System.out.println("main thread");
    new Thread(() -> System.out.println("five")).start();
    new Thread(() -> System.out.println("six")).start();
    new Thread(() -> System.out.println("seven")).start();
    System.out.println("main thread");
    new Thread(() -> System.out.println("eight")).start();
    new Thread(() -> System.out.println("nine")).start();
    new Thread(() -> System.out.println("ten")).start();
    System.out.println("main thread");
  }
}

class MyRunnable implements Runnable {
  String name;
  public MyRunnable(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("Im on thread:"+name);
  }
}
