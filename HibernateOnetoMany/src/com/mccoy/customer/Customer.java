package com.mccoy.customer;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="Customers")
public class Customer
{
	@Id
	@Column(name="Customer_ID")
	@SequenceGenerator(name = "hibernate_seq", sequenceName = "hibernate_id_seq", allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_seq")
	private int  cust_Id;
	
	@Column(name="Customer_NAME") 
	private String custName;
	@Column(name="Customer_email") 
	private String custEmail;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Cust_No")
	private Collection<Bank> bank = new ArrayList<Bank>();
	public int getCust_Id() 
	{
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) 
	{
		this.cust_Id = cust_Id;
	}
	public String getCustName() 
	{
		return custName;
	}
	public void setCustName(String custName) 
	{
		this.custName = custName;
	}
	public String getCustEmail() 
	{
		return custEmail;
	}
	public void setCustEmail(String custEmail) 
	{
		this.custEmail = custEmail;
	}
	public Collection<Bank> getBank() 
	{
		return bank;
	}
	public void setBank(Collection<Bank> bank) 
	{
		this.bank = bank;
	}

}
