package com.sathya.springex;

public class Bus implements Vehicle{

	private String busType;
	private int maxSpeed;
	
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("You Selected Bus Vehicle");
		System.out.println("BusType="+busType);
		System.out.println("MaxSpeed="+maxSpeed);
	}
}
