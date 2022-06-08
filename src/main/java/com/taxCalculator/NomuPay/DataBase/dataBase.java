package com.taxCalculator.NomuPay.DataBase;

import java.util.ArrayList;
import java.util.List;

import com.taxCalculator.NomuPay.Model.CountryTaxSlab;
import com.taxCalculator.NomuPay.Model.TaxSlab;

public class dataBase {
	


	public static CountryTaxSlab findByCountryCode(String countryCode) {
		// TODO Auto-generated method stub
		
		
		if(countryCode.equals("+91")) {
			
			CountryTaxSlab countryTaxSlab = new CountryTaxSlab();
			countryTaxSlab.setCountryCode(countryCode);
			
			List<TaxSlab> taxSlabs = new ArrayList<TaxSlab>();
			
			taxSlabs.add(new TaxSlab(1,250000,0));
			taxSlabs.add(new TaxSlab(250001,500000,5));
			taxSlabs.add(new TaxSlab(500001,750000,10));
			taxSlabs.add(new TaxSlab(750001,1000000,15));
			taxSlabs.add(new TaxSlab(1000001,1250000,20));
			taxSlabs.add(new TaxSlab(1250001,1500000,25));
			taxSlabs.add(new TaxSlab(1500001,Double.MAX_VALUE,30));
			
			countryTaxSlab.setTaxSlabs(taxSlabs);
			
			return countryTaxSlab;
		}
		
		else if(countryCode.equals("+1")) {

			CountryTaxSlab countryTaxSlab = new CountryTaxSlab();
			countryTaxSlab.setCountryCode(countryCode);
			
			List<TaxSlab> taxSlabs = new ArrayList<TaxSlab>();
			
			taxSlabs.add(new TaxSlab(1,9950,10));
			taxSlabs.add(new TaxSlab(9951,40525,12));
			taxSlabs.add(new TaxSlab(40526,86375,22));
			taxSlabs.add(new TaxSlab(86376,164925,24));
			taxSlabs.add(new TaxSlab(164926,209425,32));
			taxSlabs.add(new TaxSlab(209426,523600,35));
			taxSlabs.add(new TaxSlab(523601,Double.MAX_VALUE,37));
			
			countryTaxSlab.setTaxSlabs(taxSlabs);
			
			return countryTaxSlab;
			
		}
		
		else {
			System.out.println(" !!! ENTER THE CORRECT COUNTRYCODE  !!!!");
		}
		
		return null;
	    
	}

	
}
