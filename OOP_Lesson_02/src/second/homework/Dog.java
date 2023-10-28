package second.homework;

public class Dog extends Animal {
	private String name;

	public Dog() {
		super();		
	}
	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getVoice() {
		System.out.println("Bark!");
		return super.getVoice();
	}
	@Override
	public void eat() {
		System.out.println("Bones and meat!");
		super.eat();
	}
	@Override
	public void sleep() {
		System.out.println("Good boy is sleeping");
		super.sleep();
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
