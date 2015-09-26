package MainPackage;
import java.util.*;

public class CalculateMonthlyPaymentAndTotalPay {
	// The APR of student loan
	private double APROfStudentLoan;
	
	// The repayment schedule in years
	private int repaymentSchedule;
	
	// The repayment schedule in months
	private int monthOfRepayment;
	
	// The percentage increase of tuition
	private double percentageIncreaseTuition;
	
	// The initial tuition
	private double initialTuition;
	
	// The monthly payment
	private double monthlyPayment;
	
	CalculateMonthlyPaymentAndTotalPay() {
	}
	
	
	public double getAPROfStudentLoan() {
		return APROfStudentLoan;
	}


	public void setAPROfStudentLoan(double aPROfStudentLoan) {
		APROfStudentLoan = aPROfStudentLoan;
	}


	public int getRepaymentSchedule() {
		return repaymentSchedule;
	}


	public void setRepaymentSchedule(int repaymentSchedule) {
		this.repaymentSchedule = repaymentSchedule;
	}


	public double getPercentageIncreaseTuition() {
		return percentageIncreaseTuition;
	}


	public void setPercentageIncreaseTuition(double percentageIncreaseTuition) {
		this.percentageIncreaseTuition = percentageIncreaseTuition;
	}


	public double getInitialTuition() {
		return initialTuition;
	}


	public void setInitialTuition(double initialTuition) {
		this.initialTuition = initialTuition;
	}


	// This method is to calculate the monthly payment for the user's student loan.
	public double calculateMonthlyPayment() {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter initial tuition for college.
		System.out.print("Please enter your initial tuition cost: ");
		this.initialTuition = input.nextDouble();
				
		// Prompt the user to enter the percentage increase for tuition each year.
		System.out.print("Please enter the percentage increase for tuition: ");
		this.percentageIncreaseTuition = input.nextDouble();
						
		// To prompt the user to enter the APR of his/her student loan, 
		// and pass it to a variable called APROfStudentLoan
		System.out.print("Please enter the APR of your loan: ");
		this.APROfStudentLoan = input.nextDouble();
		
		// To prompt the user to enter the repayment schedule in years, 
		// and pass it to a variable called repaymentSchedule.
		System.out.print("Please enter the repayment schedule: ");
		this.repaymentSchedule = input.nextInt();
		
		// To get how many months in repayment schedule.
		monthOfRepayment = this.repaymentSchedule * 12;
		
		// To get the monthly percentage rate of student loan.
		double monthlyPercentageRateOfLoan = this.APROfStudentLoan / 12;		
		
		// Use a for loop to get the total amount of loan for user to complete 4 year college.
		for (int i = 0; i < 3; i++){
			this.initialTuition += initialTuition * this.percentageIncreaseTuition;
		}		
		
		// To get the monthly payment by using formula.
		this.monthlyPayment =  this.initialTuition * monthlyPercentageRateOfLoan/
				 (1-1/Math.pow(1 + monthlyPercentageRateOfLoan, this.monthOfRepayment));
		
		return this.monthlyPayment;
	}
	
	// This method is to get the total tuition for the user to complete 4 years college.
	public double calculateTotalTuition() {
	
		//// Use a for loop to get the total tuition for user to complete 4 year college.
		double totalTuition = this.monthlyPayment * this.monthOfRepayment;
		return totalTuition;
	}
}
