package constructors;

public class Animal {
	String age;
	String color;
	public Animal() {
		
	}
	public Animal(String age,String color) {
		this.age = age;
		this.color = color;
	}
	
	public void print() {
		System.out.println("Age "+age+" color "+color);
	}
	public static void main(String[] args) {
		Animal cat = new Animal("5","black");
		
		cat.print();
		
		
	}

}
