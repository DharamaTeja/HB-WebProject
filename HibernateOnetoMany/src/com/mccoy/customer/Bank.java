package com.mccoy.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Banking")
public class Bank
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="Sl_no")
private int custId;

  @Column(name="BANK_NAME")
private String bankName;
  
  @Column(name="ACC_TYPE")
  private String accType;
    
  @Column(name="ACC_NO")
  private long accNo;
    
public long getAccNo() {
	return accNo;
}

public void setAccNo(long accNo) {
	this.accNo = accNo;
}

public int getCustId() {
	return custId;
}

public String getAccType() {
	return accType;
}

public void setAccType(String accType) {
	this.accType = accType;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getBankName() {
	return bankName;
}

public void setBankName(String bankName) {
	this.bankName = bankName;
}

}