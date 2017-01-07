package com.isoftstone.finance.managesystem.base.model.models;


import com.isoftstone.finance.managesystem.base.model.interfaces.IEnableEntity;

public class EnableEntity<PKType extends Number> extends SimpleEntity<PKType> implements IEnableEntity {
	
	private boolean enable;
	
    public boolean getEnable(){
		return this.enable;
	}
    public void setEnable(boolean enable){
		this.enable=enable;
	}	

}
