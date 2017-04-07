package basic.lab;
import javax.swing.JOptionPane;

public class Run {
	
	
	public static void main(String [ ] args)
	{
		Calculation creditAnnuit = new CreditAnnuit();
		Calculation creditDiff   = new CreditDiff();
		Customer customer = new Customer();
		
		customer.setSumm(1000);
		customer.setName("Ivan");
		customer.setTotalPeriod(3);
		creditDiff.setRate(100.0);
		creditAnnuit.setRate(100.0);
		
		boolean diff = false;
		
		if (diff){
			for (int iPeriod=0;iPeriod<customer.getTotalPeriod();iPeriod++){
				JOptionPane.showMessageDialog(null, Float.toString(creditAnnuit.mCalcCreditValue(customer, iPeriod)));
			}
		} else {
			JOptionPane.showMessageDialog(null, Float.toString(creditDiff.mCalcCreditValue(customer, 0)));
		};
	}
}
