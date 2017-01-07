package com.isoftstone.finance.managesystem.base.service.interfaces;

import java.util.Map;
import com.isoftstone.finance.managesystem.base.dao.interfaces.ISimpleEntityDao;
import com.isoftstone.finance.managesystem.base.model.models.SimpleEntity;

public interface ISimpleEntityService<PKType extends Number, EntityType extends SimpleEntity<PKType>, IDaoType extends ISimpleEntityDao<PKType, EntityType>> extends IEntityService<PKType, EntityType, IDaoType> {
    public Map<PKType, String> getSelectSource();
}
