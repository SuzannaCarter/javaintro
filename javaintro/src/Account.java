import java.util.Date;

class Account {
    // data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// no-arg constructor
	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	// constructor that uses specified amounts
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		double monthlyInterestRate = annualInterestRate/12;
		return balance * monthlyInterestRate;
	}
	
	double withdraw(double amount) {
		return balance -= amount;
	}

	double deposit(double amount) {
		return balance += amount;
	}
	
	// returns string representation of object
	public String toString() {
		java.util.Date dateCreated = new java.util.Date();
		return ("Account ID: " + getId() + "\nAccount Balance: " + getBalance() + "\nInterest Rate: " + 
		getAnnualInterestRate()*100 + "%" + "\nDate Opened: " + dateCreated);
	}
}
