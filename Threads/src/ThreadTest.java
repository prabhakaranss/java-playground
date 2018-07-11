public class ThreadTest {

  public static void main(String[] args) {

    new ThreadOne("first").start();
    Thread thread2 = new ThreadOne("second");
    thread2.start();
    thread2.interrupt();
    new ThreadOne("third").start();
  }

}

class ThreadOne extends Thread {

  public ThreadOne(String name) {
    super(name);
  }

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("printing from thread:"+this.getName());
  }
}
