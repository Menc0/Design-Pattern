package com.cwh.design.proxy;
/**
 * ����ģʽ
 * Զ�̴���RemoteProxy��Ϊһ�������ڲ�ͬ�ĵ�ַ�ռ��ṩ�ֲ�����
 * �����VirtualProxy��������Ҫ���������ܴ�Ķ���
 * ��������ProtectionProxy�����ƶ�ԭʼ����ķ���
 * ����ָ����SmartReference��ȡ���˼򵥵�ָ�룬���ڷ��ʶ���ʱִ��һЩ���Ӳ���
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
