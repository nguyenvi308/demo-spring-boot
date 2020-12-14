package com.nguyenvi.domain;


/*CREATE TABLE `BANK_ACCCOUNT` (
	    ACCOUNT_ID INT AUTO_INCREMENT PRIMARY KEY,
	    USER_ID INT NOT NULL UNIQUE,
	    BANK_ID INT NOT NULL,
	    ACCOUNT_TYPE_ID INT NOT NULL,
	    
	    FOREIGN KEY (BANK_ID)
	        REFERENCES BANK (BANK_ID),
	    FOREIGN KEY (ACCOUNT_TYPE_ID)
	        REFERENCES ACCOUNT_TYPE (ACCOUNT_TYPE_ID)
	);*/
public class Account {
	
	private Long accountId; 
	private User user; 
	private Bank bank; 
	private Account_Type accountType;
	
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Account_Type getAccountType() {
		return accountType;
	}
	public void setAccountType(Account_Type accountType) {
		this.accountType = accountType;
	} 
	
	
	
}
