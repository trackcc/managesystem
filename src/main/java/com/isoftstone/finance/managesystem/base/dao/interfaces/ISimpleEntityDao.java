package com.isoftstone.finance.managesystem.base.dao.interfaces;


import com.isoftstone.finance.managesystem.base.model.models.SimpleEntity;

public interface ISimpleEntityDao<PKType extends Number, EntityType extends SimpleEntity<PKType>> extends IEntityDao<PKType, EntityType> {
	
}
