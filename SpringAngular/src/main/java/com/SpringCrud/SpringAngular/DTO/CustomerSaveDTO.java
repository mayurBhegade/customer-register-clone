package com.SpringCrud.SpringAngular.DTO;

public class CustomerSaveDTO
{

	private String customername;
	
	private String customerAddress;
	
	private int mobile;

	public CustomerSaveDTO( String customername, String customerAddress, int mobile) {
		super();
		
		this.customername = customername;
		this.customerAddress = customerAddress;
		this.mobile = mobile;
	}

	public CustomerSaveDTO() {
		super();
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
		return "CustomerDTO [customername=" + customername + ", customerAddress="
				+ customerAddress + ", mobile=" + mobile + "]";
	}
	
	
}
