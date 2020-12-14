package com.nguyenvi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/*CREATE TABLE `USER` (
	    USER_ID INT AUTO_INCREMENT PRIMARY KEY,
	    USER_NAME VARCHAR(45) NOT NULL,
	    USER_AGE TINYINT
	);*/

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="USER_ID")
	private Long userId; 
	
	@Column(name ="USER_NAME")
	private String name; 
	
	@Column(name ="USER_AGE")
	private int age;
	
	@ElementCollection
	@CollectionTable(name="USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	@AttributeOverrides(
			{
				@AttributeOverride(name = "addressLine1" , column = @Column(name = "ADDRESS_LINE_1")),
				@AttributeOverride(name = "addressLine2" , column = @Column(name = "ADDRESS_LINE_2"))
			})
	private List<Address> addresses= new ArrayList<>(); 
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userId + "  " + name + "  " + age; 
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
	
	
}
