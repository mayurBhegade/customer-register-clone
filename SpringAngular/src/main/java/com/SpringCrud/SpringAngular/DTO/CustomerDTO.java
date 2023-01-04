package com.SpringCrud.SpringAngular.DTO;


public class CustomerDTO
{
	private int customerid;
	
	private String customername;
	
	private String customerAddress;
	
	private int mobile;

	public CustomerDTO(int customerid, String customername, String customerAddress, int mobile) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerAddress = customerAddress;
		this.mobile = mobile;
	}

	public CustomerDTO() {
		super();
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerid=" + customerid + ", customername=" + customername + ", customerAddress="
				+ customerAddress + ", mobile=" + mobile + "]";
	}
	
	
}
