package seventh.homework;

public class Main {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    Printer prnt = new Printer();

	    PrinterTask task1 = new PrinterTask(prnt, "Hello");
	    PrinterTask task2 = new PrinterTask(prnt, "Java");

	    Thread thread1 = new Thread(task1);
	    Thread thread2 = new Thread(task2);

	    thread1.start();
	    thread2.start();

	  }

	}
