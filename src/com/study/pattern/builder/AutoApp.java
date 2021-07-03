/**
 * 
 */
package com.study.pattern.builder;

import com.study.pattern.builder.model.Auto;
import com.study.pattern.builder.model.AutoBuilder;

/**
 * @author rajan
 * Builder design pattern
 *
 */
public class AutoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Auto i20=new AutoBuilder().setName("i20").setSpeed(150).setDoor(4).setPower(6000).setWheel(4).getAuto();
		System.out.println(i20);

	}

}
