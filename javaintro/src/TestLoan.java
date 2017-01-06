import java.util.Scanner;

public class TestLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
		System.out.print("\n\n");
		Loan carLoan = new Loan(8.5, 5, 15000);
		System.out.println("Annual Interest Rate: " + carLoan.getAnnualInterestRate());
		System.out.println("Number of Years: " + carLoan.getNumberOfYears());
		System.out.println("Loan Amount: " + carLoan.getLoanAmount());
		System.out.println("Monthly Payment: " + carLoan.getMonthlyPayment());
		System.out.println("Total Payment: " + carLoan.getTotalPayment());
		System.out.println("Loan was created on: " + carLoan.getLoanDate());
		
		carLoan.setAnnualInterestRate(7);
		carLoan.setNumberOfYears(9);
		carLoan.setLoanAmount(10000);
		
		System.out.print("\n");
		System.out.println("New Annual Interest Rate: " + carLoan.getAnnualInterestRate());
		System.out.println("New Number of Years: " + carLoan.getNumberOfYears());
		System.out.println("New Loan Amount: " + carLoan.getLoanAmount());
		System.out.println("New Monthly Payment: " + carLoan.getMonthlyPayment());
		System.out.println("New Total Payment: " + carLoan.getTotalPayment());
		System.out.println("New Loan was created on: " + carLoan.getLoanDate());
	}
}
