/**
 * 
 */
package com.study.pattern.builder.model;

/**
 * @author rajan
 * 
 * Builder class for Auto
 *
 */
public class AutoBuilder {
	
	int wheel;
	int door;
	String name;
	float power;
	double speed;
	/**
	 * @param wheel
	 */
	public AutoBuilder setWheel(int wheel) {
		this.wheel = wheel;
		return this;
	}
	/**
	 * @param door
	 * @return
	 */
	public AutoBuilder setDoor(int door) {
		this.door = door;
		return this;
	}
	/**
	 * @param name
	 * @return
	 */
	public AutoBuilder setName(String name) {
		this.name = name;
		return this;
	}
	/**
	 * @param power
	 * @return
	 */
	public AutoBuilder setPower(float power) {
		this.power = power;
		return this;
	}
	/**
	 * @param speed
	 * @return
	 */
	public AutoBuilder setSpeed(double speed) {
		this.speed = speed;
		return this;
	}
	
	/**
	 * @return
	 */
	public Auto getAuto() {
		return new Auto(wheel, door, name, power, speed);
	}

}
