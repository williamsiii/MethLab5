package basic.lab;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Testing {
	Calculation creditAnnuit = new CreditAnnuit();
	Calculation creditDiff   = new CreditDiff();
	Customer customer = new Customer();
	
	
	@Before
	public void setUp(){
		customer.setSumm(1000);
		customer.setName("Ivan");
		customer.setTotalPeriod(3);
		creditDiff.setRate(100.0);
		creditAnnuit.setRate(100.0);
    }
	
	@SuppressWarnings("deprecation")
	
	@Test
	public void testAnnuit(){
		int ret;
		
		ret = Math.round(creditAnnuit.mCalcCreditValue(customer, 0));
		assertEquals(ret,133667);
		ret = Math.round(creditAnnuit.mCalcCreditValue(customer, 1));
		assertEquals(ret,100333);
		ret = Math.round(creditAnnuit.mCalcCreditValue(customer, 2));
		assertEquals(ret,67000);
	}
	@Test
	public void testDiff(){
		int ret;
		
		ret = Math.round(creditDiff.mCalcCreditValue(customer, 0));
		assertEquals(ret,100000);
	}
}
