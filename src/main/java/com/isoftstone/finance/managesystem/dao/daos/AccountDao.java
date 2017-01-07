package com.isoftstone.finance.managesystem.dao.daos;

import com.isoftstone.finance.managesystem.base.dao.daos.EnableEntityDao;
import com.isoftstone.finance.managesystem.dao.interfaces.IAccountDao;
import com.isoftstone.finance.managesystem.model.models.Account;
import org.springframework.stereotype.Repository;

@Repository("AccountDao")
public class AccountDao extends EnableEntityDao<Integer, Account> implements IAccountDao {


}
