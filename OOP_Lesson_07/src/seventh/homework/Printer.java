package seventh.homework;

public class Printer {
	  private Long thrId = null;

	  public synchronized void printPage(String text) {

	    Long threadId = Thread.currentThread().getId();
	    for (; thrId != null && thrId.equals(threadId);) {
	      try {
	        wait();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }
	    System.out.print(text + " ");
	    thrId = threadId;
	    notifyAll();
	  }

	}
