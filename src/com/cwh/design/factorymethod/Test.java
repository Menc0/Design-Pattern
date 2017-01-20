package com.cwh.design.factorymethod;
/**
 * ��һ���಻֪���������봴���Ķ�������ʱ��
 * ��һ����ϣ��������������ָ�����������Ķ����ʱ��
 * ���ཫ���������ְ��ί�и�������������е�ĳһ����������ϣ������һ�����������Ǵ�������һ��Ϣ�ֲ�����ʱ��
 * ���ڼ򵥹�����������չ
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
        IEatFactory catEatFactory = new CatEatFactory();
        catEatFactory.getEat().eating();
        
        IEatFactory dogEatFactory = new DogEatFactory();
        dogEatFactory.getEat().eating();
    }

}
