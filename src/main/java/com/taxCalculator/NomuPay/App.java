package com.taxCalculator.NomuPay;

import java.util.Scanner;

import com.taxCalculator.NomuPay.ApplicationService.NomuPayApplicationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	NomuPayApplicationService nomuPayService = new NomuPayApplicationService();
    	
        System.out.println( "Welcome to the Tax International Tax Calculator" );
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Enter your CTC : " );
        double ctc = sc.nextDouble();
        
        
        System.out.println( "Enter your countryCode : " );
        String countryCode = sc.next();
        
        double ApplicableIncomeTax =  nomuPayService.getTaxSlabsByCountryCode(countryCode,ctc);
        
        
        System.out.println("\n  Applicable Income Tax : " + ApplicableIncomeTax);
        
    }
}
