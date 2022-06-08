package com.taxCalculator.NomuPay.ApplicationService;

import com.taxCalculator.NomuPay.BusinessLayer.NomuPayTaxCalculation;
import com.taxCalculator.NomuPay.DataBase.dataBase;
import com.taxCalculator.NomuPay.Model.CountryTaxSlab;

public class NomuPayApplicationService {

	NomuPayTaxCalculation nomuPayTaxCalculation = new NomuPayTaxCalculation();
	
	 public double getTaxSlabsByCountryCode(String countryCode, double ctc) {
		
		
		CountryTaxSlab countryTaxSlab = dataBase.findByCountryCode(countryCode);
		               
		double taxAmount = nomuPayTaxCalculation.calculateTaxAmount(ctc,countryTaxSlab.getTaxSlabs());
		
		return taxAmount;
		
	}

}
