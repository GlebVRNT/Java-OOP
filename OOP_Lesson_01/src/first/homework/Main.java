package first.homework;

public class Main {

	public static void main(String[] args) {		
		Phone p1 = new Phone(500, "Samsung", 0.300);
		Phone p2 = new Phone(1000, "Iphone", 0.200);
		System.out.println(p1);
		System.out.println(p2);
		
		Triangle t = new Triangle(3.0, 4.0, 5.0);
		Triangle tr = new Triangle(6.0, 7.0, 8.0);
		System.out.println(t);
		System.out.println(t.findArea());
		System.out.println(tr.findArea());
		
	}
}
