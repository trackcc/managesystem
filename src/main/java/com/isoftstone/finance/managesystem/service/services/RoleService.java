package com.isoftstone.finance.managesystem.service.services;

import java.util.ArrayList;
import java.util.List;

import com.isoftstone.finance.managesystem.base.service.services.EnableEntityService;
import com.isoftstone.finance.managesystem.common.exception.EntityOperateException;
import com.isoftstone.finance.managesystem.common.exception.ValidatException;
import com.isoftstone.finance.managesystem.common.utilities.PageList;
import com.isoftstone.finance.managesystem.common.utilities.PageListUtil;
import com.isoftstone.finance.managesystem.dao.interfaces.IRoleDao;
import com.isoftstone.finance.managesystem.model.models.Authority;
import com.isoftstone.finance.managesystem.model.models.Role;
import com.isoftstone.finance.managesystem.service.interfaces.IAuthorityService;
import com.isoftstone.finance.managesystem.service.interfaces.IRoleService;
import com.isoftstone.finance.managesystem.service.models.RoleSearch;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*import static ch.lambdaj.Lambda.*;
import static ch.lambdaj.collection.LambdaCollections.*;
import static org.hamcrest.Matchers.*;*/

@Service("RoleService")
public class RoleService extends EnableEntityService<Integer, Role, IRoleDao> implements IRoleService {
	
	@Autowired
    @Qualifier("AuthorityService")
	protected IAuthorityService authorityService;

	@Autowired
	public RoleService(@Qualifier("RoleDao")IRoleDao roleDao){
		
		super(roleDao);
		/*List<Role> ff=new ArrayList<Role>();
		
		List<Role> ps2 = select(ff,
		//注意下面greaterThanOrEqualTo方法中参数的类型一定要和getWeight严格相等
		having(on(Role.class).getPosition(), greaterThanOrEqualTo(new Integer(500)))
		);*/
		
		//this.entityDao=roleDao;//Role.class.
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public PageList<Role> listPage(RoleSearch search, int pageNo, int pageSize) {
		Criteria countCriteria = entityDao.getCriteria();	
		Criteria listCriteria = entityDao.getCriteria();
		
        if(search!=null){
        	if(search.getName()!=null && !search.getName().isEmpty()){
        		countCriteria.add(Restrictions.eq("name", search.getName())); 
        		listCriteria.add(Restrictions.eq("name", search.getName())); 
        	}
        }
          	
        listCriteria.setFirstResult((pageNo-1)*pageSize);  
        listCriteria.setMaxResults(pageSize);
        List<Role> items = listCriteria.list();
        countCriteria.setProjection(Projections.rowCount());
        Integer count=Integer.parseInt(countCriteria.uniqueResult().toString());
        return PageListUtil.getPageList(count, pageNo, items, pageSize);
    }
	
	public void saveAuthorize(Integer roleId, Integer[] authorityIds) throws ValidatException, EntityOperateException {
		Role role=super.get(roleId);
		List<Authority> authorities=new ArrayList<Authority>();
		if(authorityIds.length>0){		
			for(Integer authorityId : authorityIds){
				authorities.add(authorityService.get(authorityId));
			}
		}
		role.setAuthorities(authorities);
		super.update(role);
	}


   /* @Override
    public Page<User> query(int pn, int pageSize, UserQueryModel command) {
        return PageUtil.getPage(userDao.countQuery(command) ,pn, userDao.query(pn, pageSize, command), pageSize);
    }*/
   
}
