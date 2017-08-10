package com.discardpast.chapter_three.component;

public class MyAddress {

	// 邮编
	private String postcode;
	// 电话
	private String phone;
	// 地址
	private String local;
	public MyAddress() {
		// super();
	}

	public MyAddress(String postcode, String phone, String local) {
		// super();
		this.postcode = postcode;
		this.phone = phone;
		this.local = local;
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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
