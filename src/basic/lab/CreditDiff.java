package basic.lab;

public class CreditDiff extends Calculation {

	@Override
	public float mCalcCreditValue(Customer customer, int iPeriod){
		float nSumm = (float) customer.getSumm();
		int iTP = customer.getTotalPeriod();
		double dRate = this.getRate();
		
		return (float) ( (nSumm*dRate) /( 1 - 1/Math.pow(1.0 + dRate, iTP)) );
	}
}
