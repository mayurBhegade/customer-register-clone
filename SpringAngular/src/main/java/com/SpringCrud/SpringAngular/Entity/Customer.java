package com.SpringCrud.SpringAngular.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "customer")
public class Customer 
{
	@Id
	@Column(name = "customer_id", length=50)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerid;
	@Column(name = "customer_name", length=50)
	private String customername;
	@Column(name = "customer_Address", length=60)
	private String customerAddress;
	@Column(name = "mobile", length=12)
	private int mobile;
	
	
	public Customer(int customerid, String customername, String customerAddress, int mobile) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerAddress = customerAddress;
		this.mobile = mobile;
	}
	
	
	public Customer() {
		super();
	}
	
	
	public Customer(String customername, String customerAddress, int mobile) {
		super();
		this.customername = customername;
		this.customerAddress = customerAddress;
		this.mobile = mobile;
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
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerAddress="
				+ customerAddress + ", mobile=" + mobile + "]";
	}
	
		
}
