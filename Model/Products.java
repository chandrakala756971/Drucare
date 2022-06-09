package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private String pId;
	private String pName;
	private String pBrand;
	public Products() {
	}
	public Products(String pId, String pName, String pBrand) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pBrand = pBrand;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
}

