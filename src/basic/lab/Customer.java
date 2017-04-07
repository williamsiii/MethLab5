package basic.lab;

public class Customer {
	private String psName;
	private double pnSummInCredit;
	private int piTotalPeriod;
	
	String getName(){
		return this.psName;
	}
	void setName(String sName){
		this.psName = sName;
	}
	
	double getSumm(){
		return this.pnSummInCredit;
	}
	
	void setSumm(double dSumm){
		this.pnSummInCredit = dSumm;
	}
	
	int getTotalPeriod(){
		return this.piTotalPeriod;
	}
	
	void setTotalPeriod(int iTotalPeriod){
		this.piTotalPeriod = iTotalPeriod;
	}
	
	
	
}
