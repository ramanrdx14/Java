package encapsulation;

public class Account {

	private int amount;
	private String accountNo;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}

class Test{
	public static void main(String[] args) {
		Account am = new Account();
		am.setAmount(12345);
		am.setAccountNo("ACC-1234567");
		System.out.println(am.getAmount());
		System.out.println(am.getAccountNo());
		
	}
}
