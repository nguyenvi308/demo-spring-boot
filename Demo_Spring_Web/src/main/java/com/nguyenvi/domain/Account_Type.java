package com.nguyenvi.domain;

import java.util.Date;

/*CREATE TABLE `ACCOUNT_TYPE` (
	    ACCOUNT_TYPE_ID INT AUTO_INCREMENT PRIMARY KEY,
	    NAME VARCHAR(45) NOT NULL,
	    CREATED_DATE DATE NOT NULL,
	    CREATED_BY VARCHAR(45) NOT NULL
	);*/
public class Account_Type {
	
		private Long accountTypeId; 
		
		private String name; 
		
		private Date createdDate; 
		
		private String createdBy;
		
		public Long getAccountTypeId() {
			return accountTypeId;
		}
		public void setAccountTypeId(Long accountTypeId) {
			this.accountTypeId = accountTypeId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		} 
		
		
		
}
