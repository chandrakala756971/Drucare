package com.drucare.fetch_employee.bean;

import java.util.List;



public class EmployeeDto {

	
	private Long empId;
	private String empNm;
	private String mobileNo;
	private String emailId;
	private String empCode;
	private String addressLine;
	private String stateNm;
	private String cityNm;
	private String countryNm;
	private String pinCode;
	private Integer salary;
	private String qualification;
	private String gender;
	private String experience;
	private String bloodGroup;
	private Boolean isActive;
	private Long orgId;
	private Long versionId;
	private List<EmployeeDeptBean> deptList;
	private List<EmployeeDesignationBean> designationList;
	
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public List<EmployeeDeptBean> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<EmployeeDeptBean> deptList) {
		this.deptList = deptList;
	}
	public List<EmployeeDesignationBean> getDesignationList() {
		return designationList;
	}
	public void setDesignationList(List<EmployeeDesignationBean> designationList) {
		this.designationList = designationList;
	}
	
	
}
