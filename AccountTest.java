package Week4;

public class AccountTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount sa1 = new CheckingAccount();
		sa1.balance = 1000;
		sa1.name = "Zane";
		sa1.a();
		sa1.withdrawl(100);
		sa1.calcInterest(10);
//		Bond a1 = new Bond ();
//		a1.balance = 1000.678;
//		a1.monthsRemain = 40;
//		a1.name = "Zane";
//		a1.setTermandRate(24);
//		System.out.println("Bond name " + a1.name);
//		System.out.println("Initial Balance: $ "+ a1.balance);
//		System.out.println("Term: "+ a1.term + " months");
//		System.out.println("INterest Rate: "+ a1.rate* 100 + "%");
//		for (int i = 0;i<5;i++) {
//		System.out.println("earning Interest for month " + (i+1));
//		a1.earnInterest();
//		}
//	
		
		

	}

}
