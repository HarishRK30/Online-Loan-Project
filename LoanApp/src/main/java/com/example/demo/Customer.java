package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "custid")
	
	private int custid;
	private String name;
	private String gender;
	private String dob;
	private String email;
	private String aadhar;
	private String constitution;
	private String nationality;
	private String catergory;
	private String address;
	private String pincode;
	private String mobile;
	private String pan;
	private String voter;
	private String income;
	private int others;
	private int cibil;
	private String password;
	private String type;
	private String nature;
	private String occupation;
	private String designation;
	private String orgname;
	private String orgaddress;
	private String loantype;
	private String amount;
	private float interest;
	private int time;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getConstitution() {
		return constitution;
	}
	public void setConstitution(String constitution) {
		this.constitution = constitution;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCatergory() {
		return catergory;
	}
	public void setCatergory(String catergory) {
		this.catergory = catergory;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getVoter() {
		return voter;
	}
	public void setVoter(String voter) {
		this.voter = voter;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public int getOthers() {
		return others;
	}
	public void setOthers(int others) {
		this.others = others;
	}
	public int getCibil() {
		return cibil;
	}
	public void setCibil(int cibil) {
		this.cibil = cibil;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgaddress() {
		return orgaddress;
	}
	public void setOrgaddress(String orgaddress) {
		this.orgaddress = orgaddress;
	}
	
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Customer() {
		super();
	}
}
