package com.isoftstone.finance.managesystem.base.service.interfaces;

import com.isoftstone.finance.managesystem.base.dao.interfaces.IChainEntityDao;
import com.isoftstone.finance.managesystem.base.model.models.ChainEntity;

import java.util.List;

public interface IChainEntityService<PKType extends Number, EntityType extends ChainEntity<PKType, EntityType>, IDaoType extends IChainEntityDao<PKType, EntityType>> extends IEnableEntityService<PKType, EntityType, IDaoType> {
	
	public List<EntityType> listChain();
	
}
