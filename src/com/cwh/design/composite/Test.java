package com.cwh.design.composite;

import java.util.List;

/**
 * ���ģʽ
 * �����ʾ����Ĳ���-�����νṹ
 * ��ϣ���û�������϶����뵥������Ĳ�ͬ���û���ͳһ��ʹ����Ͻṹ�е����ж���
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
        Employer pm = new ProjectManager("��Ŀ����");
        Employer pa = new ProjectAssistant("��Ŀ����");
        Employer programmer1 = new Programmer("����Աһ");
        Employer programmer2 = new Programmer("����Ա��");
        
        pm.add(pa);//Ϊ��Ŀ���������Ŀ����
        pm.add(programmer2);//Ϊ��Ŀ������ӳ���Ա
        pm.add(programmer1);//Ϊ��Ŀ������ӳ���Ա
        
        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
