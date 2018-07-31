public class ThreadNotSafeSample {

}

class addExpenseThread implements Runnable {

  Integer currentExpense;String

  public addExpenseThread(Integer currentExpense) {
    this.currentExpense = currentExpense;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(100);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
