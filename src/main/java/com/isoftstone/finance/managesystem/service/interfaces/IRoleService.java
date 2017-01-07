package com.isoftstone.finance.managesystem.service.interfaces;

import com.isoftstone.finance.managesystem.base.service.interfaces.IEnableEntityService;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import com.isoftstone.finance.managesystem.common.utilities.PageList;
import com.isoftstone.finance.managesystem.dao.interfaces.IRoleDao;
import com.isoftstone.finance.managesystem.model.models.Role;
import com.isoftstone.finance.managesystem.service.models.RoleSearch;

public interface IRoleService extends IEnableEntityService<Integer, Role, IRoleDao> {

	public PageList<Role> listPage(RoleSearch search, int pageNo, int pageSize);
	public void saveAuthorize(Integer roleId, Integer[] authorityIds) throws ValidatException, EntityOperateException;

}