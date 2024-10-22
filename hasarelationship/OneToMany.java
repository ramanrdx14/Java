package hasarelationship;

class Student{
	String stdid;
	String name;
	Course[] courses;
	Student(String stdid,String name,Course[] course){
		this.stdid = stdid;
		this.name  = name;
	    this.courses = course;
	}
	public void show() {
		System.out.println("Student ID: "+this.stdid);
		System.out.println("Student Name: "+this.name);
		for(int i=0;i<courses.length;i++) {
			System.out.println("Course Name :"+courses[i].courseName+" Branch Name :"+courses[i].branch);
		}
	}
}

class Course{
	String courseName;
	String branch;
	Course(String courseName,String branch){
		this.courseName = courseName;
		this.branch     = branch;
	}
}
public class OneToMany {

	public static void main(String[] args) {
		Course c1 = new Course("B1", "C1");
		Course c2 = new Course("B2", "C2");
		Course c3 = new Course("B3", "C3");
		
		
		Student s = new Student("123","XyZ",new Course[] {c1,c2,c3});
		s.show();

	}

}
