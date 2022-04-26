package com.celloscope.springbootdatabase.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	private String id;
    private String name;
    
    @Column(name = "phone")
    private String phoneNo;
    
    
    
    
	public Customer() {
	}
	public Customer(String id, String name, String phoneNo) {
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
   
}
