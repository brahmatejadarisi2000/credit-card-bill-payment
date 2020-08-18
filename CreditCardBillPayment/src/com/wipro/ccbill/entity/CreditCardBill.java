package com.wipro.ccbill.entity;

import java.util.Date;
import com.wipro.ccbill.exception.*;


public class CreditCardBill {
	
	private String creditCardNo;
	private String customerid;
	private Date billDate;
	private Transaction monthTransactions[];
	
	public CreditCardBill()
	{
		
	}
	public CreditCardBill(String creditCardNo,String customerid,Date billDate,Transaction monthTransactions[])
	{
		
		this.creditCardNo=creditCardNo;
		this.billDate=billDate;
		this.customerid=customerid;
		this.monthTransactions=monthTransactions;
	}
	public double getTotalAmount(String transactionType)
	{
		
		if(transactionType.equals("DB") || transactionType.equals("CR"))
		{
			
			
		            Double Amount=0.0;
		            
		            for (Transaction mt: monthTransactions){
		            	
		            	
		                if(mt.getTransactionType().equals(transactionType)) {
		                	
		                	
		                	
		                    Amount=Amount+(double)mt.getTransactionamount();
		                }
		            }
		           
		            return Amount;
		        }
		
		        return (double)0;
		       
		  
		
	}
	
		public double calculateBillAmount() 
	    {

	        try
	        {

	        if(!(validateData()).equals("valid"))
	        {
	           
	            
	            return 0.0;
	            
	        }
	        else if(monthTransactions==null||monthTransactions.length==0)
	        {
	        	
	            return 0.0;
	        }
	        else
	        {
	        	
	        double outstanding_amount=getTotalAmount("DB")-getTotalAmount("CR");
	       
	      
	        double interest=(outstanding_amount*(19.9/12))/100.0;
	        return outstanding_amount+interest;
	    }
	        }
	        
	        catch(Exception e)
	        {
	        	return 0;
	        }
			
		
	    }
	
	public String validateData() throws InputValidationException
	{
		
			 if(!(creditCardNo!=null&&creditCardNo.length()==16 && customerid!=null && customerid.length()>=6))
		        {
		            throw new InputValidationException();
		        }
		        return "valid";
		    }
	

}
