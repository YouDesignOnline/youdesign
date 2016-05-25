package com.youdesign.online.domain;

import java.util.List;

public class ItemInventory {
	private int itemCode;
	private String name;
	private String description;
	private String type;
	private String imageURL1;
	private String imageURL2;
	private String imageURL3;
	private String imageURL4;
	private int availableQuantity;
	private String color;
	private String supplier;
	private String supplierLocation;
	private String supplierAddress;
	private short supplierRating;
	private Flag isSleeveCustomizable;
	private Flag isNeckCustomizable;
	private Flag isBackCustomizable;
	private Flag isLengthCustomizable;
	private Flag isPocketCustomizable;
	private short itemRatings;
	private List<ItemReviews> itemReviews;
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getImageURL1() {
		return imageURL1;
	}
	public void setImageURL1(String imageURL1) {
		this.imageURL1 = imageURL1;
	}
	public String getImageURL2() {
		return imageURL2;
	}
	public void setImageURL2(String imageURL2) {
		this.imageURL2 = imageURL2;
	}
	public String getImageURL3() {
		return imageURL3;
	}
	public void setImageURL3(String imageURL3) {
		this.imageURL3 = imageURL3;
	}
	public String getImageURL4() {
		return imageURL4;
	}
	public void setImageURL4(String imageURL4) {
		this.imageURL4 = imageURL4;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierLocation() {
		return supplierLocation;
	}
	public void setSupplierLocation(String supplierLocation) {
		this.supplierLocation = supplierLocation;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public short getSupplierRating() {
		return supplierRating;
	}
	public void setSupplierRating(short supplierRating) {
		this.supplierRating = supplierRating;
	}
	public Flag getIsSleeveCustomizable() {
		return isSleeveCustomizable;
	}
	public void setIsSleeveCustomizable(Flag isSleeveCustomizable) {
		this.isSleeveCustomizable = isSleeveCustomizable;
	}
	public Flag getIsNeckCustomizable() {
		return isNeckCustomizable;
	}
	public void setIsNeckCustomizable(Flag isNeckCustomizable) {
		this.isNeckCustomizable = isNeckCustomizable;
	}
	public Flag getIsBackCustomizable() {
		return isBackCustomizable;
	}
	public void setIsBackCustomizable(Flag isBackCustomizable) {
		this.isBackCustomizable = isBackCustomizable;
	}
	public Flag getIsLengthCustomizable() {
		return isLengthCustomizable;
	}
	public void setIsLengthCustomizable(Flag isLengthCustomizable) {
		this.isLengthCustomizable = isLengthCustomizable;
	}
	public Flag getIsPocketCustomizable() {
		return isPocketCustomizable;
	}
	public void setIsPocketCustomizable(Flag isPocketCustomizable) {
		this.isPocketCustomizable = isPocketCustomizable;
	}
	public short getItemRatings() {
		return itemRatings;
	}
	public void setItemRatings(short itemRatings) {
		this.itemRatings = itemRatings;
	}
	public List<ItemReviews> getItemReviews() {
		return itemReviews;
	}
	public void setItemReviews(List<ItemReviews> itemReviews) {
		this.itemReviews = itemReviews;
	}
	
	
	
}
