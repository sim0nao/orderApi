package com.order.entities.enums;

public enum OrderStatus {
	
	WAINTING_PAID("WAINTING_PAID"),
	PAID("PAID"),
	SHIPPED("SHIPPED"),
	DELIVERED("DELIVERED"),
	CANCELED("CANCELED");
	
	private String nameEnum;
	
	private OrderStatus(String nameEnum) {
		this.nameEnum = nameEnum;
	}
	
	public String getNameEnum() {
		return nameEnum;
	}
	
}
