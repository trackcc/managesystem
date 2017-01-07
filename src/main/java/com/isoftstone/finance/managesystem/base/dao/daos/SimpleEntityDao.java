package com.isoftstone.finance.managesystem.base.dao.daos;

import com.isoftstone.finance.managesystem.base.dao.interfaces.ISimpleEntityDao;
import com.isoftstone.finance.managesystem.base.model.models.SimpleEntity;

public abstract class SimpleEntityDao<PKType extends Number, EntityType extends SimpleEntity<PKType>>
	extends EntityDao<PKType, EntityType> implements ISimpleEntityDao<PKType, EntityType> {

}
