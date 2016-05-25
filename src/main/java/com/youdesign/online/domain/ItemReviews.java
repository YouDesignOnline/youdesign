/**
 * 
 */
package com.youdesign.online.domain;

import java.sql.Timestamp;

/**
 * @author Shoaib.Zahir
 *
 */
public class ItemReviews {
	private long reviewId;
	private long userId;
	private int itemCode;
	private String review;
	private Timestamp reviewDateTime;
	public long getReviewId() {
		return reviewId;
	}
	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
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
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Timestamp getReviewDateTime() {
		return reviewDateTime;
	}
	public void setReviewDateTime(Timestamp reviewDateTime) {
		this.reviewDateTime = reviewDateTime;
	}
	
}
