package com.isoftstone.finance.managesystem.dao.daos;

import com.isoftstone.finance.managesystem.base.dao.daos.EnableEntityDao;
import com.isoftstone.finance.managesystem.dao.interfaces.IRoleDao;
import com.isoftstone.finance.managesystem.model.models.Role;
import org.springframework.stereotype.Repository;

@Repository("RoleDao")
public class RoleDao extends EnableEntityDao<Integer, Role> implements IRoleDao {


}
