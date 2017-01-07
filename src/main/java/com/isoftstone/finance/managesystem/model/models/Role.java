package com.isoftstone.finance.managesystem.model.models;

import java.util.List;
import com.isoftstone.finance.managesystem.base.model.interfaces.ICUDEable;
import com.isoftstone.finance.managesystem.base.model.models.EnableEntity;

public class Role extends EnableEntity<Integer> implements ICUDEable {

	private List<Authority> authorities;

	public void setAuthorities(List<Authority> authorities){
		this.authorities=authorities;
	}
	
	public List<Authority> getAuthorities(){
		return this.authorities;
	}
	
}
