package com.cwh.design.strategy;
/**
 * 策略模式（与代理模式相似，桥接模式也有相似之处）
 * 
 * 一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为
 * 一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。 这个状态通常用一个或多个枚举常量表示。
 * 通常,有多个操作包含这一相同的条件结构。 State模式将每一个条件分支放入一个独立的类中。 
 * 这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化
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
