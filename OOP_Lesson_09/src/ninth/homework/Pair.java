package ninth.homework;

public class Pair<L, R> {
	  private L left;
	  private R rigth;

	  public Pair(L left, R rigth) {
	    super();
	    this.left = left;
	    this.rigth = rigth;
	  }

	  public Pair() {
	    super();
	  }

	  public L getLeft() {
	    return left;
	  }

	  public void setLeft(L left) {
	    this.left = left;
	  }

	  public R getRigth() {
	    return rigth;
	  }

	  public void setRigth(R rigth) {
	    this.rigth = rigth;
	  }

	  @Override
	  public String toString() {
	    return "Pair [left=" + left + ", rigth=" + rigth + "]";
	  }

	}
