package com.cwh.design.strategy;
/**
 * ����ģʽ�������ģʽ���ƣ��Ž�ģʽҲ������֮����
 * 
 * һ���������Ϊȡ��������״̬,����������������ʱ�̸���״̬�ı�������Ϊ
 * һ�������к����Ӵ�Ķ��֧��������䣬����Щ��֧�����ڸö����״̬�� ���״̬ͨ����һ������ö�ٳ�����ʾ��
 * ͨ��,�ж������������һ��ͬ�������ṹ�� Stateģʽ��ÿһ��������֧����һ�����������С� 
 * ��ʹ������Ը��ݶ������������������״̬��Ϊһ��������һ������Բ���������������������仯
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
		Context ctx = new Context(new StrategyImplA());
        ctx.doMethod();
        
        ctx = new Context(new StrategyImplB());
        ctx.doMethod();
        
        ctx = new Context(new StrategyImplC());
        ctx.doMethod();
	}
}
