package com.isoftstone.finance.managesystem.base.dao.daos;

import java.util.List;

import com.isoftstone.finance.managesystem.base.dao.interfaces.IEnableEntityDao;
import com.isoftstone.finance.managesystem.base.model.interfaces.IEnableable;
import com.isoftstone.finance.managesystem.base.model.models.EnableEntity;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public abstract class EnableEntityDao<PKType extends Number, EntityType extends EnableEntity<PKType>>
	extends SimpleEntityDao<PKType, EntityType> implements IEnableEntityDao<PKType, EntityType> {

	@Override
	@SuppressWarnings("unchecked")
	public List<EntityType> listEnable() {
		Criteria criteria = getCriteria();
		criteria.add(Restrictions.eq("enable", true)); 
		return criteria.list();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<EntityType> listDisable() {
		Criteria criteria = getCriteria();
		criteria.add(Restrictions.eq("enable", false)); 
		return criteria.list();
	}	
	
	@Override
	public void enable(EntityType entity) throws EntityOperateException, ValidatException{
		if(entity==null)
			throw new NullPointerException("entity is null!");
		else if(!(entity instanceof IEnableable))
			throw new EntityOperateException("the entity not support IEnableable throw by enable!");
		entity.setEnable(true);
		update(entity);
	}
	
	@Override
	public void disable(EntityType entity) throws EntityOperateException, ValidatException{
		if(entity==null)
			throw new NullPointerException("entity is null!");
		else if(!(entity instanceof IEnableable))
			throw new EntityOperateException("the entity not support IEnableable throw by disable!");
		entity.setEnable(false);
		update(entity);
	}	
}