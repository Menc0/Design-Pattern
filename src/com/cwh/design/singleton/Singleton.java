package com.cwh.design.singleton;
/**
 * µ¥ÀýÄ£Ê½
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
public class Singleton {

	private static Singleton instants = null;

	public static Singleton getInstants() {
		if(null == instants){
			instants = new Singleton();
		}
		return instants;
	}
	
}
