package com.isoftstone.finance.managesystem.base.service.services;

import java.util.List;

import com.isoftstone.finance.managesystem.base.dao.interfaces.IChainEntityDao;
import com.isoftstone.finance.managesystem.base.model.models.ChainEntity;
import com.isoftstone.finance.managesystem.base.service.interfaces.IChainEntityService;
import org.hibernate.criterion.Restrictions;

public abstract class ChainEntityService<PKType extends Number, EntityType extends ChainEntity<PKType, EntityType>, IDaoType extends IChainEntityDao<PKType, EntityType>>
	extends EnableEntityService<PKType, EntityType, IDaoType> implements IChainEntityService<PKType, EntityType, IDaoType> {
	
	public ChainEntityService(IDaoType dao){
		super(dao);
	}
	
	@SuppressWarnings("unchecked")
	public List<EntityType> listChain(){
		return entityDao.getCriteria().add(Restrictions.isNull("parent")).list();
	}

}
