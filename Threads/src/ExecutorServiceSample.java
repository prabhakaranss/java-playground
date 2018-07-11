import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSample {

  public static void main(String[] args) throws Exception {

    //new ExecutorServiceSample().executeTest();
    new ExecutorServiceSample().TestSubmit();
  }

  private void executeTest() {
    ExecutorService service = Executors.newFixedThreadPool(10);
    service.execute(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("one");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    service.execute(() -> System.out.println("two"));
    service.execute(() -> System.out.println("three"));
    service.execute(() -> System.out.println("four"));
    service.shutdown();
  }
  private void TestSubmit() throws ExecutionException, InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(10);
    Future future = service.submit(() -> {
      try {
        Thread.sleep(1000);
        System.out.println("one");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    System.out.println("main thread");
    System.out.println(future.get());
    service.shutdown();
  }
}
