package com.wipro.ccbill.entity;

import java.util.Date;

public class Transaction {
	private String creditCardNo;
	private Date dateOfTransaction;
	private String transactionDesc;
	private Double transactionamount;
	private String transactionType;
	public Transaction()
	{
		
	}
	public Transaction(String creditCardNo,Date dateOfTransaction,String transactionDesc,double transactionamount,String transactionType)
	
	{
		this.creditCardNo=creditCardNo;
		this.dateOfTransaction=dateOfTransaction;
		this.transactionamount=transactionamount;
		this.transactionDesc=transactionDesc;
		this.transactionType=transactionType;
	}
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public String getTransactionDesc() {
		return transactionDesc;
	}
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	public Double getTransactionamount() {
		return transactionamount;
	}
	public void setTransactionamount(Double transactionamount) {
		this.transactionamount = transactionamount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}