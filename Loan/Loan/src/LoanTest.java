import org.junit.Test;

public class LoanTest {

    Loan loan = new Loan();

    // Example: Testing setLoanAmount and getLoanAmount for loan class.
    @Test
    public void setLoanTest() throws Exception {
        loan.setLoanAmount(10);
        assert (loan.getLoanAmount() == 10);
    }

    /*
     * TODO:
     * 		1. Test ALL getters and setters in the Loan class.
     * 		2. Test the getMonthlyPayment() method.
     * 		3. Test the getTotalPayment() method.
     *
     * 		For the getMonthlyPayment() method and the getTotalPayment() method,
     * 		test these for a few different values. Are there any values that can be used to
     * 		break the class?
     *
     * */


    /* UnitTest - Exception when setting loan amount to negative number. */
    @Test() // Hint. You need to add a parameter to the annotation in order for the UnitTest to work properly.
    public void negativeTest() throws Exception {
        loan.setLoanAmount(1);
        assert (loan.getLoanAmount() == 1);
    }

    //Testing number of years in loan class.
    @Test()
    public void NumberOfYearsTest() throws Exception {
        loan.setNumberOfYears(1);
        assert (loan.getNumberOfYears() == 1);
    }

    //Testing annual interest rate in loan class
    @Test()
    public void AnnualInterestRateTest() throws Exception {
        loan.setAnnualInterestRate(2.5);
        assert (loan.getAnnualInterestRate() == 2.5);
    }

    //Testing loan amount in loan class
    @Test()
    public void loanAmountTest() throws Exception {
        loan.setLoanAmount(1000);
        assert (loan.getLoanAmount() == 1000);
    }

    //Testing getMonthlyPayment method
    @Test
    public void MonthlyPaymentTest() throws Exception {
        assert(loan.getMonthlyPayment() == 84.4661111639436);
    }

    //Testing getTotalPayment() method.
    @Test
    public void TotalPaymentTest() throws Exception {
        assert(loan.getTotalPayment() == 1013.59333397);
    }
}

