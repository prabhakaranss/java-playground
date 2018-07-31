public class ThreadRaceSample {

  public static void main(String[] args) throws InterruptedException {
    StringBuilder stringBuilder = new StringBuilder();
    new Thread(new RunnableRace(stringBuilder),"FirstThread").start();
    new Thread(new RunnableRace(stringBuilder),"SecondThread").start();
    new Thread(new RunnableRace(stringBuilder),"ThirdThread").start();
    new Thread(new RunnableRace(stringBuilder),"FourThread").start();
    new Thread(new RunnableRace(stringBuilder),"FiveThread").start();
    new Thread(new RunnableRace(stringBuilder),"SixThread").start();
    Thread.sleep(1000);
    System.out.println("Results:"+stringBuilder.toString());
  }
}

class RunnableRace implements Runnable {
StringBuilder stringBuilder;

  public RunnableRace(StringBuilder stringBuilder) {
    this.stringBuilder = stringBuilder;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    stringBuilder.append(Thread.currentThread().getName()+"\n");
  }
}
