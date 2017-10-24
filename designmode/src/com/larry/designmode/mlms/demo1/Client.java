package com.larry.designmode.mlms.demo1;

/**
 * 客户端角色类
 * @author baorui
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();

		
	}

}
