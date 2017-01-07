package com.isoftstone.finance.managesystem.weixinapi.sender;

import com.isoftstone.finance.managesystem.weixinapi.contract.FieldContract;

import java.io.IOException;

public class DefaultSender extends BaseSender {
	
	public static DefaultSender newInstance(){
		return new DefaultSender();
	}
	
	public String getAccessTokenJson(String appid, String secret) throws IOException{
		String requestURL=String.format(FieldContract.ACCESS_TOKEN_URL, appid, secret);
		String accessTokenJson=httpsGet(requestURL);
		return accessTokenJson;
	}
	
	public String createMenu(String accessToken, String menuStr) throws IOException{
		String requestURL=String.format(FieldContract.MENU_CREATE_URL, accessToken);
		String createMenuResultJson=httpsPost(requestURL, menuStr);
		return createMenuResultJson;
	}
	
	public String getMenuJson(String accessToken) throws IOException{
		String requestURL=String.format(FieldContract.MENU_GET_URL, accessToken);
		String menuJson=httpsGet(requestURL);
		return menuJson;
	}
	
	
}
