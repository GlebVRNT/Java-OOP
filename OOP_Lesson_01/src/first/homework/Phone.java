/*Создайте пользовательский класс для описания товара (предположим, это задел для интернет-магазина). 
 * В качестве свойств товара можете использовать значение цены, описание, вес товара. 
 * Создайте пару экземпляров вашего класса и протестируйте их работу.
 * */
package first.homework;

public class Phone {
	private int price;
	private String description;
	private double weight;
	
	public Phone(int price, String description, double weight) {
		this.price = price;
		this.description = description;
		this.weight = weight; 
	}	
	public Phone() {
		super();
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return "Phone [price = " + price + " ,description = " + description + " ,weight = " + weight + "]";
	}
}
