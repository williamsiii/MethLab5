package basic.lab;

public class CreditAnnuit extends Calculation {

	@Override
	public float mCalcCreditValue (Customer customer, int iPeriod){
		float nSumm = (float) customer.getSumm();
		int iTP = customer.getTotalPeriod();
		double dRate = this.getRate();
		
		return (float) ( (nSumm/iTP) + nSumm*(iTP-iPeriod+1)*dRate/iTP);
	}
	
}
