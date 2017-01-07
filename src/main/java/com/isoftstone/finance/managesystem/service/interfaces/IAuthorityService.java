package com.isoftstone.finance.managesystem.service.interfaces;

import com.isoftstone.finance.managesystem.base.service.interfaces.IChainEntityService;
import com.isoftstone.finance.managesystem.common.utilities.PageList;
import com.isoftstone.finance.managesystem.dao.interfaces.IAuthorityDao;
import com.isoftstone.finance.managesystem.model.models.Authority;
import com.isoftstone.finance.managesystem.service.models.AuthoritySearch;

public interface IAuthorityService extends IChainEntityService<Integer, Authority, IAuthorityDao> {

	public PageList<Authority> listPage(AuthoritySearch search, int pageNo, int pageSize);
	
}