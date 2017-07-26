package com.discardpast.chapter_three.single_primary_key;

import javax.persistence.Embeddable;

public class MyAddress {

	// 邮编
	private String postcode;
	// 电话
	private String phone;
	// 地址
	private String myselfaddress;

	public MyAddress() {
		// super();
	}

	public MyAddress(String postcode, String phone, String myselfaddress) {
		// super();
		this.postcode = postcode;
		this.phone = phone;
		this.myselfaddress = myselfaddress;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return myselfaddress;
	}

	public void setAddress(String myselfaddress) {
		this.myselfaddress = myselfaddress;
	}

}
