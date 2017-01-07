package com.isoftstone.finance.managesystem.service.services;

import java.util.List;

import com.isoftstone.finance.managesystem.base.service.services.ChainEntityService;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import com.isoftstone.finance.managesystem.common.utilities.PageList;
import com.isoftstone.finance.managesystem.common.utilities.PageListUtil;
import com.isoftstone.finance.managesystem.dao.interfaces.IOrganizationDao;
import com.isoftstone.finance.managesystem.model.models.Organization;
import com.isoftstone.finance.managesystem.service.interfaces.IOrganizationService;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("OrganizationService")
public class OrganizationService extends ChainEntityService<Integer, Organization, IOrganizationDao> implements IOrganizationService {
	
	@Autowired
	public OrganizationService(@Qualifier("OrganizationDao")IOrganizationDao organizationDao){
		super(organizationDao);
	}
	
	@Override
	public void update(Organization model) throws ValidatException, EntityOperateException{
		Organization dbModel=super.get(model.getId());
		dbModel.setName(model.getName());
		dbModel.setPosition(model.getPosition());
		dbModel.setTheValue(model.getTheValue());
		dbModel.setParent(model.getParent());
		super.update(dbModel);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public PageList<Organization> listPage(String name, int pageNo, int pageSize) {
		Criteria countCriteria = entityDao.getCriteria();
		Criteria listCriteria = entityDao.getCriteria();
		
        if(name!=null && !name.isEmpty()){
        	countCriteria.add(Restrictions.eq("name", name)); 
    		listCriteria.add(Restrictions.eq("name", name));
        }
          	
        listCriteria.setFirstResult((pageNo-1)*pageSize);  
        listCriteria.setMaxResults(pageSize);
        List<Organization> items = listCriteria.list();
        countCriteria.setProjection(Projections.rowCount());
        Integer count=Integer.parseInt(countCriteria.uniqueResult().toString());
        return PageListUtil.getPageList(count, pageNo, items, pageSize);
    }

}
