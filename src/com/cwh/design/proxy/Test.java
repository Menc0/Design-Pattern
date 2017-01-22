package com.cwh.design.proxy;
/**
 * 代理模式
 * 远程代理（RemoteProxy）为一个对象在不同的地址空间提供局部代表
 * 虚代理（VirtualProxy）根据需要创建开销很大的对象
 * 保护代理（ProtectionProxy）控制对原始对象的访问
 * 智能指引（SmartReference）取代了简单的指针，它在访问对象时执行一些附加操作
 * @author  cwh
  ___                  _
/\  _ `\   _       _  /\ \                       
\ \ \/\_\ /\ \    /\ \\ \ \___        
 \ \ \/_/_\ \ \  _\ \ \\ \  _ `\  
  \ \ \L\ \\ \ \/ _` \ \\ \ \ \ \ 
   \ \____/ \ \_ /_ \_ / \ \_\ \_\
    \/___/   \/_/  \/_/   \/_/\/_/
 *
 */
public class Test {

	public static void main(String []args){
		Object obj = new ProxyObject();
		obj.action();
	}
}
