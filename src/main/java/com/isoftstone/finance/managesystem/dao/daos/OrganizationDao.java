package com.isoftstone.finance.managesystem.dao.daos;

import com.isoftstone.finance.managesystem.base.dao.daos.ChainEntityDao;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import com.isoftstone.finance.managesystem.dao.interfaces.IOrganizationDao;
import com.isoftstone.finance.managesystem.model.models.Organization;
import org.springframework.stereotype.Repository;

@Repository("OrganizationDao")
public class OrganizationDao extends ChainEntityDao<Integer, Organization> implements IOrganizationDao {

	@Override
	public void delete(Organization organization) throws EntityOperateException, ValidatException{
		super.checkNull(organization);
		super.checkUpdatable(organization);
		if(organization.getChildren()!=null && !organization.getChildren().isEmpty())
    		throw new ValidatException("The entity has children can't be delete!");
    	else
    		super.getSession().delete(organization);
	}

}
