package com.drucare.fetch_employee.bean;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class FetchEmployeeDto {
	@ApiModelProperty(value="It is db generated id for id")
	private Long empId;
	
	@ApiModelProperty(value="It is db generated id for empNm")
    private String empNm;
	
	
	@ApiModelProperty(value="It is db generated id for gender")
	private String gender;
	
	@ApiModelProperty(value="It is db generated id for mobileNo")
	private String mobileNo;
//	private String alterMobileNo;
	@ApiModelProperty(value="It is db generated id for salary")
	private Double salary;
	@ApiModelProperty(value="It is db generated id for emailId")
	private String emailId;
	@ApiModelProperty(value="It is db generated id for empCode")
	private String empCode;
	@ApiModelProperty(value="It is db generated id for addressLine")
	private String addressLine;
	@ApiModelProperty(value="It is db generated id for stateNm")
	private String stateNm;
	@ApiModelProperty(value="It is db generated id for cityNm")
	private String cityNm;
	@ApiModelProperty(value="It is db generated id for countryNm")
	private String countryNm;
	@ApiModelProperty(value="It is db generated id for pincode")
	private String pinCode;
	@ApiModelProperty(value="It is db generated id for qualification")
	private String qualification;
	@ApiModelProperty(value="It is db generated id for experience")
	private String experience;
	@ApiModelProperty(value="It is db generated id for isActive")
	private Boolean isActive;
	@ApiModelProperty(value="It is db generated id for orgId")
    private Integer orgId;
	private List<EmployeeDeptBean> empDeptList;
	private List<EmployeeDesignationBean> empDesignationList;
	
	
	public List<EmployeeDeptBean> getEmpDeptList() {
		return empDeptList;
	}
	public void setEmpDeptList(List<EmployeeDeptBean> empDeptList) {
		this.empDeptList = empDeptList;
	}
	public List<EmployeeDesignationBean> getEmpDesignationList() {
		return empDesignationList;
	}
	public void setEmpDesignationList(List<EmployeeDesignationBean> empDesignationList) {
		this.empDesignationList = empDesignationList;
	}
	
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
//	public String getAlterMobileNo() {
//		return alterMobileNo;
//	}
//	public void setAlterMobileNo(String alterMobileNo) {
//		this.alterMobileNo = alterMobileNo;
//	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getStateNm() {
		return stateNm;
	}
	public void setStateNm(String stateNm) {
		this.stateNm = stateNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getCountryNm() {
		return countryNm;
	}
	public void setCountryNm(String countryNm) {
		this.countryNm = countryNm;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}