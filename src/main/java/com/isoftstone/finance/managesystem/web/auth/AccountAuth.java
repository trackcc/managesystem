package com.isoftstone.finance.managesystem.web.auth;

import com.isoftstone.finance.managesystem.model.models.Account;

public class AccountAuth {
	
	private Integer id;
	private String name;
	private String username;
	private AccountRole accountRole;
	
	public AccountAuth(Integer id, String name, String username){
		this.id=id;
		this.name=name;
		this.username=username;
	}

	public AccountAuth(Account account){
		this.id=account.getId();
		this.name=account.getName();
		this.username=account.getUsername();
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public void setAccountRole(AccountRole accountRole){
		this.accountRole=accountRole;
	}
	
	public Integer getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getUsername(){
		return this.username;
	}
	public AccountRole getAccountRole(){
		return this.accountRole;
	}
	
}
