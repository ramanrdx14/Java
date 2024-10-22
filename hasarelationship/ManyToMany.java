package hasarelationship;

class CollegeStudent{
	String stdid;
	String stdName;
	Language[] lang;
	public CollegeStudent(String stdid,String stdName,Language[] lang) {
		this.stdid = stdid;
		this.stdName = stdName;
		this.lang  = lang;
	}
	public void show() {
		System.out.println("-----------------------------------");
		System.out.println("Stdid : "+this.stdid);
		System.out.println("Std Name: "+this.stdName);
		for(int i=0;i<lang.length;i++) {
			System.out.println(lang[i].id+" "+lang[i].Lname);
		}
	}
}
class Language{
	String id;
	String Lname;
	public Language(String id,String Lname) {
		this.id = id;
		this.Lname = Lname;
	}
}
public class ManyToMany {

	public static void main(String[] args) {
		
		Language java = new Language("1", "Java");
		Language javascript  = new Language("2", "Javascript");
		Language python = new Language("3", "Python");
		
		CollegeStudent  s1   = new CollegeStudent("s-101", "ABC", new Language[] {java,javascript,python});
		CollegeStudent s2    =  new CollegeStudent("s-102", "DEF",new Language[] {java,javascript,python});
		
		
		s1.show();
		s2.show();
	}

}
