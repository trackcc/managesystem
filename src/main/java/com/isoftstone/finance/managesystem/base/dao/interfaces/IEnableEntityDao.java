package com.isoftstone.finance.managesystem.base.dao.interfaces;

import java.util.List;
import com.isoftstone.finance.managesystem.base.model.models.EnableEntity;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;

public interface IEnableEntityDao<PKType extends Number, EntityType extends EnableEntity<PKType>> extends ISimpleEntityDao<PKType, EntityType> {
	
	public List<EntityType> listEnable();
	public List<EntityType> listDisable();
	public void enable(EntityType entity) throws EntityOperateException, ValidatException;
	public void disable(EntityType entity) throws EntityOperateException, ValidatException;
	
}
