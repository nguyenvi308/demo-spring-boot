package com.nguyenvi.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/*ADDRESS_LINE_1 VARCHAR(45) NOT NULL,
ADDRESS_LINE_2 VARCHAR(45) NOT NULL,
CITY VARCHAR(45)*/

@Embeddable
public class Address {
	
	@Column(name = "ADDRESS_LINE_1")
	private String addressLine1; 
	@Column(name = "ADDRESS_LINE_2")
	private String addressLine2; 
	@Column(name = "CITY")
	private String city;
	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return  addressLine1 + "  " + addressLine2 + "  " + city; 
				
	} 


}
