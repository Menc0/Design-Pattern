package com.cwh.design.bridge;
/**
 * �Ž�ģʽ������һ�־ۺϣ�
 * �㲻ϣ���ڳ��������ʵ�ֲ���֮����һ���̶��İ󶨹�ϵ�� �������������������Ϊ���ڳ�������ʱ��ʵ�ֲ���Ӧ���Ա�ѡ������л�
 * ��ĳ����Լ�����ʵ�ֶ�Ӧ�ÿ���ͨ����������ķ����������䡣 ��ʱBridgeģʽʹ����ԶԲ�ͬ�ĳ���ӿں�ʵ�ֲ��ֽ�����ϣ����ֱ�����ǽ�������
 * ��һ�������ʵ�ֲ��ֵ��޸�Ӧ�Կͻ�������Ӱ�죬���ͻ��Ĵ��벻�����±���
 * ��������ͼһ�ڵĵ�һ����ͼ����ʾ���������������Ҫ���ɡ� ����һ�����νṹ˵������뽫һ������ֽ����������
 * �����ڶ������乲��ʵ�֣�����ʹ�����ü���������ͬʱҪ��ͻ�����֪����һ��
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

	 public static void main(String[] args) {
	        
	        Person man = new Man();
	        
	        Person lady = new Lady();
	        
	        Clothing jacket = new Jacket();
	        
	        Clothing trouser = new Trouser();
	        
	        jacket.personDressCloth(man);
	        trouser.personDressCloth(man);

	        jacket.personDressCloth(lady);
	        trouser.personDressCloth(lady);
	        
	    }
}
