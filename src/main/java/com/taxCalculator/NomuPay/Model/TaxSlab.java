package com.taxCalculator.NomuPay.Model;

public class TaxSlab {

	private double startingAmount;
	
	private double endingAmount;
	
	private double TaxRate;
	
	public TaxSlab() {
		//default constructor
	}
	
	public TaxSlab(double startingAmount, double endingAmount, double taxRate) {
		this.startingAmount = startingAmount;
		this.endingAmount = endingAmount;
		TaxRate = taxRate;
	}

	public double getStartingAmount() {
		return startingAmount;
	}

	public void setStartingAmount(double startingAmount) {
		this.startingAmount = startingAmount;
	}

	public double getEndingAmount() {
		return endingAmount;
	}

	public void setEndingAmount(double endingAmount) {
		this.endingAmount = endingAmount;
	}

	public double getTaxRate() {
		return TaxRate;
	}

	public void setTaxRate(double taxRate) {
		TaxRate = taxRate;
	}
	
}
