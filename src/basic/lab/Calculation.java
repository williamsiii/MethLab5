package basic.lab;

public abstract class Calculation {

	private double pnInterestRate;
	
	double getRate(){
		return this.pnInterestRate;
	}
	void setRate(double dRate){
		this.pnInterestRate = dRate;
	}

	public abstract float mCalcCreditValue(Customer customer, int iPeriod);


}