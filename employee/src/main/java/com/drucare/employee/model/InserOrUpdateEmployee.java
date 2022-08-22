package com.drucare.employee.model;

import java.sql.Timestamp;

public class InserOrUpdateEmployee {
	                                    //Student_info_ref table bean
                                        //--------------------------------
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
//		private Timestamp  createDttm;
	//	private Timestamp modifiedDttm;

	
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
    //	public Timestamp getCreateDttm() {
	//		return createDttm;
	//	}
	//	public void setCreateDttm(Timestamp createDttm) {
	//		this.createDttm = createDttm;
	//	}
	//	public Timestamp getModifiedDttm() {
	//		return modifiedDttm;
	//	}
	//	public void setModifiedDttm(Timestamp modifiedDttm) {
	//		this.modifiedDttm = modifiedDttm;
	//	}
	//
	
	
	
/*                                              //department table bean
                                             // -----------------------	
private Long deptId;
private String deptNm;
private Boolean isActive;



public Boolean getIsActive() {
	return isActive;
}
public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
}
public Long getDeptId() {
	return deptId;
}
public void setDeptId(Long deptId) {
	this.deptId = deptId;
}
public String getDeptNm() {
	return deptNm;
}
public void setDeptNm(String deptNm) {
	this.deptNm = deptNm;
}


                                  //employee_department_xref
                                   //	--------------------
//private Long empDeptId;
//private Long empId;
//private Long deptId;
//private Long orgId;
//private Boolean isActive;
//private Timestamp createdDttm;
//private Long versionId;
//
//public Long getEmpDeptId() {
//	return empDeptId;
//}
//public void setEmpDeptId(Long empDeptId) {
//	this.empDeptId = empDeptId;
//}
//public Long getEmpId() {
//	return empId;
//}
//public void setEmpId(Long empId) {
//	this.empId = empId;
//}
//public Long getDeptId() {
//	return deptId;
//}
//public void setDeptId(Long deptId) {
//	this.deptId = deptId;
//}
//public Long getOrgId() {
//	return orgId;
//}
//public void setOrgId(Long orgId) {
//	this.orgId = orgId;
//}
//public Boolean getIsActive() {
//	return isActive;
//}
//public void setIsActive(Boolean isActive) {
//	this.isActive = isActive;
//}
//public Timestamp getCreatedDttm() {
//	return createdDttm;
//}
//public void setCreatedDttm(Timestamp createdDttm) {
//	this.createdDttm = createdDttm;
//}
//public Long getVersionId() {
//	return versionId;
//}
//public void setVersionId(Long versionId) {
//	this.versionId = versionId;
//}

                                       //designation_ref 
                                     //-----------------------
//private Long designationId;
//private String designationNm;
//private Boolean isActive;
//public Long getDesignationId() {
//	return designationId;
//}
//public void setDesignationId(Long designationId) {
//	this.designationId = designationId;
//}
//public String getDesignationNm() {
//	return designationNm;
//}
//public void setDesignationNm(String designationNm) {
//	this.designationNm = designationNm;
//}
//public Boolean getIsActive() {
//	return isActive;
//}
//public void setIsActive(Boolean isActive) {
//	this.isActive = isActive;
//}


                                        //employee_designation_xref
                                       //---------------------------------
//private Long empId;
//private Long designationId;
//private Long orgId;
//private Long empDesignationId;
//private Boolean isActive;
//private Long versionId;
//private Timestamp createdDttm;
//public Long getEmpId() {
//	return empId;
//}
//public void setEmpId(Long empId) {
//	this.empId = empId;
//}
//public Long getDesignationId() {
//	return designationId;
//}
//public void setDesignationId(Long designationId) {
//	this.designationId = designationId;
//}
//public Long getOrgId() {
//	return orgId;
//}
//public void setOrgId(Long orgId) {
//	this.orgId = orgId;
//}
//public Long getEmpDesignationId() {
//	return empDesignationId;
//}
//public void setEmpDesignationId(Long empDesignationId) {
//	this.empDesignationId = empDesignationId;
//}
//public Boolean getIsActive() {
//	return isActive;
//}
//public void setIsActive(Boolean isActive) {
//	this.isActive = isActive;
//}
//public Long getVersionId() {
//	return versionId;
//}
//public void setVersionId(Long versionId) {
//	this.versionId = versionId;
//}
//public Timestamp getCreatedDttm() {
//	return createdDttm;
//}
//public void setCreatedDttm(Timestamp createdDttm) {
//	this.createdDttm = createdDttm;
//}
//

}
*/
}