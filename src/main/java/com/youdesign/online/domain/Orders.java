package com.youdesign.online.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Orders {
	private long orderId;
	private long userId;
	private int itemCode;
	private int quantity;
	private int price;
	private String size;
	private int subSize;
	private Size customSize;
	private String neck;
	private String sleeve;
	private String length;
	private Flag pocket;
	private Date expectedDeliveryDate;
	private Timestamp orderDateTime;
	private String orderStatus;
	private String paymentMode;
	private String specialRequest;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getSubSize() {
		return subSize;
	}
	public void setSubSize(int subSize) {
		this.subSize = subSize;
	}
	public Size getCustomSize() {
		return customSize;
	}
	public void setCustomSize(Size customSize) {
		this.customSize = customSize;
	}
	public String getNeck() {
		return neck;
	}
	public void setNeck(String neck) {
		this.neck = neck;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public Flag getPocket() {
		return pocket;
	}
	public void setPocket(Flag pocket) {
		this.pocket = pocket;
	}
	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public Timestamp getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(Timestamp orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getSpecialRequest() {
		return specialRequest;
	}
	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}

}
