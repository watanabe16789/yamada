package com.higashi.store.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemQuantityBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal id;
	private BigDecimal sum;

	public OrderItemQuantityBean(BigDecimal id, BigDecimal sum) {
		super();
		this.id = id;
		this.sum = sum;
	}

	public OrderItemQuantityBean(Object[] obj) {
		this((BigDecimal) obj[0], (BigDecimal) obj[1]);
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
