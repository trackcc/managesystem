package com.isoftstone.finance.managesystem.web.models.extension;


import com.isoftstone.finance.managesystem.model.models.Account;
import com.isoftstone.finance.managesystem.web.models.AccountAuthorizeModel;

public class AccountAuthorizeModelExtension {
	
	public static AccountAuthorizeModel toAccountBindModel(Account account){
		AccountAuthorizeModel ret=new AccountAuthorizeModel();
		ret.setName(account.getName());
		ret.setUsername(account.getUsername());
		if(account.getRole()!=null)
			ret.setRoleId(account.getRole().getId());
		if(account.getOrganization()!=null)
			ret.setOrganizationId(account.getOrganization().getId());
		
		return ret;
	}
	
}
