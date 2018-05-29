package cn.mldn.test;

import cn.mldn.service.IMessage;
import cn.mldn.service.impl.MessageImpl;

public class TestMessage {
	public static void main(String[] args) {
		IMessage msg = new MessageImpl();
		System.out.println(msg.echo("www.mldn.cn"));
	}
}
