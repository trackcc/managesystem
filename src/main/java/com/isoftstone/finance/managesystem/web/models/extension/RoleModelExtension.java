package com.isoftstone.finance.managesystem.web.models.extension;

import com.isoftstone.finance.managesystem.model.models.Role;
import com.isoftstone.finance.managesystem.service.models.RoleSearch;
import com.isoftstone.finance.managesystem.web.models.RoleEditModel;
import com.isoftstone.finance.managesystem.web.models.RoleSearchModel;

public class RoleModelExtension {
	public static RoleSearch toRoleSearch(RoleSearchModel searchModel){
		RoleSearch ret=new RoleSearch();
		ret.setName(searchModel.getName());
		
		return ret;
	}
	
	public static Role toRole(RoleEditModel editModel){
		Role role=new Role();
		role.setId(editModel.getId());
		role.setName(editModel.getName());
		return role;
	}
}
