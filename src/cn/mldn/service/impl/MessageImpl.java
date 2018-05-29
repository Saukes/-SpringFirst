package cn.mldn.service.impl;

import cn.mldn.service.IMessage;

public class MessageImpl implements IMessage {

	@Override
	public String echo(String val) {
		return "【ECHO】" + val;
	}

}
