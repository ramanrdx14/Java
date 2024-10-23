package usearealation;

class Marks{
	public void marks() {
		System.out.println("Marks");
	}
}
public class Student {
	public void getMarks() {
		Marks m = new Marks();
		m.marks();
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.getMarks();

	}

}
