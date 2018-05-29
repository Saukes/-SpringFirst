package cn.mldn.test;

import cn.mldn.service.IMessage;
import cn.mldn.service.impl.MessageImpl;

public class TestMessage {
	public static void main(String[] args) {
		//保存所有类中的分支中的信息
		IMessage msg = new MessageImpl();
		System.out.println(msg.echo("www.mldn.cn"));
	}
}
