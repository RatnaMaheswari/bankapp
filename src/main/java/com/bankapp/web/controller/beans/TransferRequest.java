package com.bankapp.web.controller.beans;

public class TransferRequest {
	private Long toaccount;
	private Long fromaccount;
	private Double amount;
	public TransferRequest(Long toaccount, Long fromaccount, Double amount) {
		this.toaccount = toaccount;
		this.fromaccount = fromaccount;
		this.amount = amount;
	}
	public Long getToaccount() {
		return toaccount;
	}
	public void setToaccount(Long toaccount) {
		this.toaccount = toaccount;
	}
	public Long getFromaccount() {
		return fromaccount;
	}
	public void setFromaccount(Long fromaccount) {
		this.fromaccount = fromaccount;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public TransferRequest() {
		
	}
	
}
