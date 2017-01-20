package com.cwh.design.factorymethod;
/**
 * 当一个类不知道它所必须创建的对象的类的时候
 * 当一个类希望由它的子类来指定它所创建的对象的时候
 * 当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候
 * 基于简单工厂的纵向扩展
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
