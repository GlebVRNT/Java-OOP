package second.homework;

public class Main {

	  public static void main(String[] args) {
	    
	    Dog d = new Dog("Meat", "Grey", 15, "Champ");
	    Cat c = new Cat("Fish", "Black", 70, "Begemot");
	    Veterinarian v = new Veterinarian("Vitaly");
	    
	    d.getVoice();
	    d.eat();
	    d.sleep();
	    
	    System.out.println();
	    
	    c.getVoice();
	    c.eat();
	    c.sleep();
	    
	    System.out.println();
	    
	    v.treatment(c);
	    v.treatment(d);
	  }
	}
