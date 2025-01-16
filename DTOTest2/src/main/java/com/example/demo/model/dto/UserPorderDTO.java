package com.example.demo.model.dto;

public class UserPorderDTO {
	private Integer userId;
	private String userName;
	private String product;
	public UserPorderDTO(Integer userId, String userName, String product) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.product = product;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
}
