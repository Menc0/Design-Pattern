package com.cwh.design.composite;

import java.util.List;

/**
 * 组合模式
 * 你想表示对象的部分-整体层次结构
 * 你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象
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
        Employer pm = new ProjectManager("项目经理");
        Employer pa = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");
        
        pm.add(pa);//为项目经理添加项目助理
        pm.add(programmer2);//为项目经理添加程序员
        pm.add(programmer1);//为项目经理添加程序员
        
        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems) {
            System.out.println(em.getName());
        }
    }
}
