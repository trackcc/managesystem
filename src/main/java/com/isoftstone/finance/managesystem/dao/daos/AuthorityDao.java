package com.isoftstone.finance.managesystem.dao.daos;

import com.isoftstone.finance.managesystem.base.dao.daos.ChainEntityDao;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import com.isoftstone.finance.managesystem.dao.interfaces.IAuthorityDao;
import com.isoftstone.finance.managesystem.model.models.Authority;
import org.springframework.stereotype.Repository;


@Repository("AuthorityDao")
public class AuthorityDao extends ChainEntityDao<Integer, Authority> implements IAuthorityDao {

	@Override
	public void delete(Authority authority) throws EntityOperateException, ValidatException{
		super.checkNull(authority);
		super.checkUpdatable(authority);
		if(authority.getChildren()!=null && !authority.getChildren().isEmpty())
    		throw new ValidatException("The entity has children can't be delete!");
		else if(authority.getRoles()!=null && !authority.getRoles().isEmpty())
			throw new ValidatException("the entity had been authorized can't be delete!");
    	else
    		super.getSession().delete(authority);
	}

}
