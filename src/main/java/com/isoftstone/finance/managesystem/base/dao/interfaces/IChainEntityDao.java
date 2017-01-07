package com.isoftstone.finance.managesystem.base.dao.interfaces;


import com.isoftstone.finance.managesystem.base.model.models.ChainEntity;

public interface IChainEntityDao<PKType extends Number, EntityType extends ChainEntity<PKType, EntityType>> extends IEnableEntityDao<PKType, EntityType> {
	
}
