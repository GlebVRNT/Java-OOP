package sixth.homework;

public class Main {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub

	    Thread mainThread = Thread.currentThread();

	    System.out.println(mainThread.getName() + " start");

	    FactorialTask task1 = new FactorialTask(10);
	    FactorialTask task2 = new FactorialTask(10);
	    FactorialTask task3 = new FactorialTask(10);

	    Thread thread1 = new Thread(task1);
	    Thread thread2 = new Thread(task2);
	    Thread thread3 = new Thread(task3);

	    thread1.start();
	    thread2.start();
	    thread3.start();
	//    
//	    try {
//	      thread1.join();
//	      thread2.join();
//	      thread3.join();    
//	    } catch (InterruptedException e) {
//	      // TODO Auto-generated catch block
//	      e.printStackTrace();
//	    }

	    thread1.interrupt();
	    thread2.interrupt();
	    thread3.interrupt();

	    System.out.println("task 1 sum = " + task1.getResult());
	    System.out.println("task 2 sum = " + task2.getResult());
	    System.out.println("task 3 sum = " + task3.getResult());

	    System.out.println(mainThread.getName() + " end");

	  }

	}
