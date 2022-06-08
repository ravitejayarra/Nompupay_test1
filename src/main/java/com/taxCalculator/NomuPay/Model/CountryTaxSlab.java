package com.taxCalculator.NomuPay.Model;

import java.util.List;

public class CountryTaxSlab {

	private String countryCode;
	
	private List<TaxSlab> taxSlabs;
	

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<TaxSlab> getTaxSlabs() {
		return taxSlabs;
	}

	public void setTaxSlabs(List<TaxSlab> taxSlabs) {
		this.taxSlabs = taxSlabs;
	}
}
