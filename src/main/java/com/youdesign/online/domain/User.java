package com.youdesign.online.domain;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class User {
	private long userid;
	private String name;
	private String email;
	private long mobileNumber;
	private Date dateOfBirth;
	private String facebookId;
	private String twitterId;
	private String instagramId;
	private Flag isAuthorizedForSocialMediaPosting;
	private String lastPaymentMode;
	private Timestamp creationTime;
	private List<String> addressList;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	public String getInstagramId() {
		return instagramId;
	}
	public void setInstagramId(String instagramId) {
		this.instagramId = instagramId;
	}
	public Flag getIsAuthorizedForSocialMediaPosting() {
		return isAuthorizedForSocialMediaPosting;
	}
	public void setIsAuthorizedForSocialMediaPosting(Flag isAuthorizedForSocialMediaPosting) {
		this.isAuthorizedForSocialMediaPosting = isAuthorizedForSocialMediaPosting;
	}
	public String getLastPaymentMode() {
		return lastPaymentMode;
	}
	public void setLastPaymentMode(String lastPaymentMode) {
		this.lastPaymentMode = lastPaymentMode;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

}
