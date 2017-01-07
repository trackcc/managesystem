package com.isoftstone.finance.managesystem.model.models;

import java.util.List;
import com.isoftstone.finance.managesystem.base.model.interfaces.ICUDEable;
import com.isoftstone.finance.managesystem.base.model.models.ChainEntity;

public class Authority extends ChainEntity<Integer, Authority> implements ICUDEable {

	private String url;
	private String matchUrl;
	private String itemIcon;
	private List<Role> roles;

	
	public void setUrl(String url){
		this.url=url;
	}
	public void setMatchUrl(String matchUrl){
		this.matchUrl=matchUrl;
	}
	public void setItemIcon(String itemIcon){
		this.itemIcon=itemIcon;
	}
	public void setRoles(List<Role> roles){
		this.roles=roles;
	}
	
	public String getUrl(){
		return this.url;
	}
	public String getMatchUrl(){
		return this.matchUrl;
	}
	public String getItemIcon(){
		return this.itemIcon;
	}
	public List<Role> getRoles(){
		return this.roles;
	}
	
}
