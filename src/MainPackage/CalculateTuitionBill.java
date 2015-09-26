package MainPackage;

public class CalculateTuitionBill {
	public static void main(String[] args) {
		
		// To create a instance of CalculateMonthlyPaymentAndTotalPay class.
		CalculateMonthlyPaymentAndTotalPay Finally = new CalculateMonthlyPaymentAndTotalPay();
		
		// To print the monthly payment for a user.
		System.out.println("Your monthly payment is: " + Finally.calculateMonthlyPayment());
		
		// To print the total tuition that the user needed to complete college.
		System.out.println("Your total tuition to complete college is: " + Finally.calculateTotalTuition());

	}	
}
