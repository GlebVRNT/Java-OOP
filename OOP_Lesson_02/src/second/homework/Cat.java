package second.homework;

public class Cat extends Animal {
	private String name;

	public Cat() {
		super();
	}
	public Cat(String ration, String color, int weight, String name) {
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
		System.out.println("Meow Meow!");
		return super.getVoice();
	}
	@Override
	public void eat() {
		System.out.println("Herring and kerosene");
		super.eat();
	}
	@Override
	public void sleep() {
		System.out.println("Don't bother the poor cat");
		super.sleep();
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}
