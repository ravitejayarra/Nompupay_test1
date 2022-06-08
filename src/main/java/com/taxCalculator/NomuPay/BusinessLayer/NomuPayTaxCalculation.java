package com.taxCalculator.NomuPay.BusinessLayer;

import java.util.List;

import com.taxCalculator.NomuPay.Model.TaxSlab;

public class NomuPayTaxCalculation {

	public double calculateTaxAmount(double ctc, List<TaxSlab> taxSlabs) {
		
		double totalTaxAmount = 0;
		
		   for(TaxSlab taxSlab : taxSlabs){
			
			double startingAmount = taxSlab.getStartingAmount();
			double endingAmount = taxSlab.getEndingAmount();
			double taxRate = taxSlab.getTaxRate()/100;
			
			if(ctc < startingAmount) {
				break;
			}
			
			if(ctc >= startingAmount && ctc >= endingAmount) {
				totalTaxAmount  += (endingAmount-startingAmount+1)*taxRate; 
			}
			else if(ctc >= startingAmount && ctc <= endingAmount) {
				totalTaxAmount += (ctc-startingAmount+1)*taxRate;
			       break;
			}
			
		};

		
		
		return totalTaxAmount;
	}

	
	
}
