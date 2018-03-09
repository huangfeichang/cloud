/**
 * 123
 */
package com.cloud.application;

import java.util.HashSet;

/**
 * @author huangfeichang
 * @date 2017年11月21日 下午8:26:25
 *
 */
public class Anno {
	/**
	 * 
	 * 123
	 * @return
	 * @return 
	 */
	@Test(value111="deu")
	public void Anno1() {
		System.err.println("s");
//		Test ss = Anno.class.getClass().getAnnotation(Test.class);
//		System.err.println(ss);
	}
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(0);
		set.add("1");set.add("1");set.add("2");
		System.err.println(set);
		
	}
}
