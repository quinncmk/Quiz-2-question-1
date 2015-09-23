package MainPackage;
import java.util.*;

public class CalculateMonthlyPaymentAndTotalPay {
	// The APR of student loan
	private double APROfStudentLoan;
	
	// The repayment schedule in years
	private int repaymentSchedule;
	
	// The percentage increase of tuition
	private double percentageIncreaseTuition;
	
	// The initial tuition
	private double initialTuition;
	
	CalculateMonthlyPaymentAndTotalPay() {
	}
	
	// This method is to calculate the monthly payment for the user's student loan.
	public double calculateMonthlyPayment() {
		
		Scanner input = new Scanner(System.in);
		
		// To prompt the user to enter the APR of his/her student loan, 
		// and pass it to a variable called APROfStudentLoan
		System.out.print("Please enter the APR of your loan: ");
		this.APROfStudentLoan = input.nextDouble();
		
		// To prompt the user to enter the repayment schedule in years, 
		// and pass it to a variable called repaymentSchedule.
		System.out.print("Please enter the repayment schedule: ");
		this.repaymentSchedule = input.nextInt();
		
		// To get how many months in repayment schedule.
		int monthOfRepayment = repaymentSchedule * 12;
		
		// To get the monthly percentage rate of student loan.
		double monthlyPercentageRateOfLoan = APROfStudentLoan / 12;		
		
		// To get the monthly payment by using formula.
		double monthlyPayment =  this.initialTuition * monthlyPercentageRateOfLoan/
				 (1-1/Math.pow(1 + monthlyPercentageRateOfLoan, monthOfRepayment));
		
		return monthlyPayment;
	}
	
	// This method is to get the total tuition for the user to complete 4 years college.
	public double calculateTotalTuition() {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter initial tuition for college.
		System.out.print("Please enter your initial tuition cost: ");
		this.initialTuition = input.nextDouble();
		
		// Prompt the user to enter the percentage increase for tuition each year.
		System.out.print("Please enter the percentage increase for tuition: ");
		this.percentageIncreaseTuition = input.nextDouble();
		
		// Use a for loop to get the total tuition for user to complete 4 year college.
		for (int i = 0; i < 3; i++){
			this.initialTuition += initialTuition * this.percentageIncreaseTuition;
		}		
		return initialTuition;
	}	
}
