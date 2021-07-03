/**
 * 
 */
package com.study.pattern.builder.model;

/**
 * @author rajan
 * Auto(in German) - car model class
 *
 */
public class Auto {

	int wheel;
	int door;
	String name;
	float power;
	double speed;
	
	/**
	 * Constructor method
	 * @param wheel
	 * @param door
	 * @param name
	 * @param power
	 * @param speed
	 */
	public Auto(int wheel, int door, String name, float power, double speed) {
		super();
		this.wheel = wheel;
		this.door = door;
		this.name = name;
		this.power = power;
		this.speed = speed;
	}

	/**
	 *toString method
	 */
	@Override
	public String toString() {
		return "Auto [wheel=" + wheel + ", door=" + door + ", name=" + name + ", power=" + power + ", speed=" + speed
				+ "]";
	}
	
}
