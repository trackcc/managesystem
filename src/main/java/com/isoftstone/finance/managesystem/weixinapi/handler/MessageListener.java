package com.isoftstone.finance.managesystem.weixinapi.handler;

import com.isoftstone.finance.managesystem.weixinapi.message.*;

public class MessageListener implements IMessageListener {
	public void onTextMessage(TextMessage textMessage){ }

	public void onImageMessage(ImageMessage imageMessage){ }

	public void onLinkMessage(LinkMessage linkMessage){ }

	public void onLocationMessage(LocationMessage locationMessage){ }

	public void onVoiceMessage(VoiceMessage voiceMessage){ }

	public void onVideoMeaasge(VideoMeaasge videoMeaasge){ }
	
	public void onErrorMsg(int i){ }
}
