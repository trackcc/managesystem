package com.isoftstone.finance.managesystem.service.interfaces;

import com.isoftstone.finance.managesystem.base.service.interfaces.IChainEntityService;
import com.isoftstone.finance.managesystem.common.utilities.PageList;
import com.isoftstone.finance.managesystem.dao.interfaces.IOrganizationDao;
import com.isoftstone.finance.managesystem.model.models.Organization;

public interface IOrganizationService extends IChainEntityService<Integer, Organization, IOrganizationDao> {

	public PageList<Organization> listPage(String name, int pageNo, int pageSize);
	
}