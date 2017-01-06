import java.util.Date;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000, .045);
		Account myAccount = new Account(1234, 1000, .06);
		Account yourAccount = new Account(5678, 100000, .01);
		
		// prints info for first account
		// also modifies info
		System.out.println("Account ID:" + account.getId());
		System.out.println("Balance:" + account.getBalance());
		System.out.println("Interest Rate:" + account.getAnnualInterestRate()*100 + "%");
		System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate()*100 + "%");
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		account.setId(2211);
		account.setBalance(2000);
		account.setAnnualInterestRate(.025);
		System.out.println("Account ID after change: " + account.getId());
		System.out.println("Balance after change: " + account.getBalance());
		System.out.println("Interest Rate after change: " + account.getAnnualInterestRate()*100 + "%");
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Balance after withdrawals/deposits: " + account.getBalance());
		System.out.println(account.toString());
		System.out.println("------------------------------");
		
		// prints info for second account
	    // also modifies info
		System.out.println("Account ID:" + myAccount.getId());
		System.out.println("Balance:" + myAccount.getBalance());
		System.out.println("Interest Rate:" + myAccount.getAnnualInterestRate()*100 + "%");
		System.out.println("Monthly Interest Rate: " + myAccount.getMonthlyInterestRate()*100 + "%");
		System.out.println("Monthly Interest: " + myAccount.getMonthlyInterest());
		myAccount.setId(4321);
		myAccount.setBalance(10000);
		myAccount.setAnnualInterestRate(.01);
		System.out.println("Account ID after change: " + myAccount.getId());
		System.out.println("Balance after change: " + myAccount.getBalance());
		System.out.println("Interest Rate after change: " + myAccount.getAnnualInterestRate()*100 + "%");
		myAccount.withdraw(1000);
		myAccount.deposit(50);
		System.out.println("Balance after withdrawals/deposits: " + myAccount.getBalance());
		System.out.println(myAccount.toString());
		System.out.println("------------------------------");
		
		// prints info for third account
		// also modifies info
		System.out.println("Account ID:" + yourAccount.getId());
		System.out.println("Balance:" + yourAccount.getBalance());
		System.out.println("Interest Rate:" + yourAccount.getAnnualInterestRate()*100 + "%");
		System.out.println("Monthly Interest Rate: " + yourAccount.getMonthlyInterestRate()*100 + "%");
		System.out.println("Monthly Interest: " + yourAccount.getMonthlyInterest());
		yourAccount.setId(4321);
		yourAccount.setBalance(10000);
		yourAccount.setAnnualInterestRate(.01);
		System.out.println("Account ID after change: " + yourAccount.getId());
		System.out.println("Balance after change: " + yourAccount.getBalance());
		System.out.println("Interest Rate after change: " + yourAccount.getAnnualInterestRate()*100 + "%");
		yourAccount.withdraw(5000);
		yourAccount.deposit(1);
		System.out.println("Balance after withdrawals/deposits: " + yourAccount.getBalance());
		System.out.print(yourAccount.toString());
		
	}
}