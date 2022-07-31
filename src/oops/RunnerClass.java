package oops;

public class RunnerClass {
	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Dept = "HR";
		E1.display();
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.display();
////		Bank b = new Bank();
////		b.DisplayBalance();
//		int Bal = b.GetBalance();
//		System.out.println("The Balance is " +b.GetBalance());
//		System.out.println("The balance is "+Bal);
		HDFCBank b1 = new HDFCBank();
		b1.CCBalance();
		b1.DisplayBalance();
		OverloadingExample obj = new OverloadingExample();
		int Rect=obj.GetArea(4,3);
		int sq=obj.GetArea(6);
		int roh= obj.GetArea(10);
		
		System.out.println("square " +sq);
		Chrome ch= new Chrome();
		FireFox fx =new FireFox();
		ch.OpenBrowser();
		ch.CloseBrowser();
		fx.OpenBrowser();
		fx.CloseBrowser();
		
		
		Browser br = new Chrome();
		br.OpenBrowser();
		br.CloseBrowser();
		br.display();
		
         HondaCar car1 = new HondaCar();
         CarInterface car2 = new HondaCar();
         EncapsulationExample En = new EncapsulationExample();
         En.setBalance(30004);
         System.out.println(En.getBalance());
	}
}
