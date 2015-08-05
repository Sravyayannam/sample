package com.cmpe202.ride;

import java.util.Date;

import com.cmpe202.payment.Payment;
import com.cmpe202.request.Request;

public abstract class Ride {

	protected Payment p;
	private Request request;
	private RideStateInterface rideState;
	private Payment payment;
	
	public abstract void pay();
	
	protected void payByCC(int amount, int noOfDays, int creditCardNumber, int CVV , String NameOnCard, Date expirydate){
		
	}
	protected void payByDC(int amount, int noOfDays, int debitCardNumber, int CVV , String NameOnCard, Date expirydate){
		
	}
	protected void redeemCoupon(int amount, int noOfDays, int couponNo){
		
	}
	protected void payByCash(int amount, int noOfDays){
		
	}
	protected void paywithPaypal(int amount, int noOfDays, String paypalAccountId){
		
	}
	public void initiateRide(){
		
	}
	public void RideInTransit(){
		
	}
	public void ConcludeRide(){
		
	}
	
}
