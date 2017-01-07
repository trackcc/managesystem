package com.isoftstone.finance.managesystem.web.models.extension;


import com.isoftstone.finance.managesystem.model.models.Role;
import com.isoftstone.finance.managesystem.web.models.RoleBindModel;

public class RoleBindModelExtension {
	
	public static RoleBindModel toRoleBindModel(Role role){
		RoleBindModel ret=new RoleBindModel();
		ret.setName(role.getName());
		
		return ret;
	}
	
}
