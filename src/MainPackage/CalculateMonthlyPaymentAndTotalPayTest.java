package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateMonthlyPaymentAndTotalPayTest {

	@Test
	public void test() {
		CalculateMonthlyPaymentAndTotalPay Test1 = new CalculateMonthlyPaymentAndTotalPay();
		Test1.setInitialTuition(10000);
		Test1.setPercentageIncreaseTuition(0.5);
		Test1.setAPROfStudentLoan(0.75);
		Test1.setRepaymentSchedule(4);
		assertTrue("Test1 CalculateMonthlyPayment works", Test1.calculateMonthlyPayment() == 2230.9075216494043);
		assertFalse("Test1 CalculateMonthlyPayment doesn't work", Test1.calculateMonthlyPayment() == 1234.56789);
		assertTrue("Test1 CalculateTotalTuiton works", Test1.calculateTotalTuition() == 107083.56103917141);
		assertFalse("Test1 CalculateTotalTuiton doesn't work", Test1.calculateTotalTuition() == 999999.9999999);	
		
		CalculateMonthlyPaymentAndTotalPay Test2 = new CalculateMonthlyPaymentAndTotalPay();
		Test2.setInitialTuition(20000);
		Test2.setPercentageIncreaseTuition(0.6);
		Test2.setAPROfStudentLoan(0.55);
		Test2.setRepaymentSchedule(8);
		assertTrue("Test2 CalculateMonthlyPayment works", Test2.calculateMonthlyPayment() == 3806.2006389998537);
		assertFalse("Test2 CalculateMonthlyPayment doesn't work", Test2.calculateMonthlyPayment() == 1234.56789);
		assertTrue("Test2 CalculateTotalTuiton works", Test2.calculateTotalTuition() == 365395.26134398597);
		assertFalse("Test2 CalculateTotalTuiton doesn't work", Test2.calculateTotalTuition() == 999999.9999999);	
	}

}
