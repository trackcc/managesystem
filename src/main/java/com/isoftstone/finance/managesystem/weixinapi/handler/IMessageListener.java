package com.isoftstone.finance.managesystem.weixinapi.handler;

import com.isoftstone.finance.managesystem.weixinapi.message.*;

public interface IMessageListener {
	public abstract void onTextMessage(TextMessage textMessage);

	public abstract void onImageMessage(ImageMessage imageMessage);

	public abstract void onLinkMessage(LinkMessage linkMessage);

	public abstract void onLocationMessage(LocationMessage LocationMessage);

	public abstract void onVoiceMessage(VoiceMessage VoiceMessage);
	
	public abstract void onVideoMeaasge(VideoMeaasge videoMeaasge);

	public abstract void onErrorMsg(int i);
}
