package hasarelationship;
class Studentt{
	String stdid;
	String stdName;
	Branch branch;
	public Studentt(String stdid,String stdName,Branch branches) {
		this.stdid = stdid;
		this.stdName = stdName;
		this.branch  = branches;
	}
	public void show() {
		System.out.println("-----------------------------------");
		System.out.println("Stdid : "+this.stdid);
		System.out.println("Std Name: "+this.stdName);
		System.out.println(branch.branchCode+" "+branch.branchName);
	}
}
class Branch{
	String branchCode;
	String branchName;
	public Branch(String branchCode,String branchName) {
		this.branchCode = branchCode;
		this.branchName = branchName;
	}
}
public class ManyToOne {
	public static void main(String[] args) {
		Branch b1 = new Branch("101", "MCA");
		
		Studentt s1= new Studentt("S-11", "XYZ",b1);
		Studentt s2= new Studentt("S-22", "ABC",b1);
		Studentt s3= new Studentt("S-33", "DEF",b1);
		s1.show();
		s3.show();
		s3.show();
	}

}
