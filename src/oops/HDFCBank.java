package oops;

public class HDFCBank extends Bank {
	public int CreditCardNum;
	int Accountnum;

	public void CCBalance() {
		System.out.println("Inside CC Balance ");
		this.CreditCardNum=73728;
		this.AccountNum = 25527;
		super.AccountNum = 8929;
	}
	public void CloseAccount(int CCNumber) {
		System.out.println("Inside HDFC Bank Account");
	}

}
