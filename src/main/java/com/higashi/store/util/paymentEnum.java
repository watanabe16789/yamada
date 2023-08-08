package com.higashi.store.util;

public enum paymentEnum {

	card(1,"クレジットカード"), 
    bank(2, "銀行振り込み"),
    cash(3, "着払い"),
    money(4, "電子マネー"),
    convenience(5," コンビニ決済 ");
	

	private int cashNum;
	
	private String cashName;
	
	private paymentEnum(int cashNum, String cashName) {
	
		this.cashNum =cashNum;
		this.cashName = cashName;
		
	}


	public int getCashNum() {
		return cashNum;
	}

	public String getCashName() {
		return cashName;
}
}