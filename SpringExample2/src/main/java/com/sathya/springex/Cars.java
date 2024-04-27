package com.sathya.springex;

public class Cars implements Vehicle{

		private String carType;
		private int maxSpeed;

	public String getCarType() {
			return carType;
		}
	public void setCarType(String carType) {
			this.carType = carType;
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
		System.out.println("You Selected Car Vehile");
		System.out.println("Car Type="+carType);
		System.out.println("maxSpeed="+maxSpeed);
	}
		
	
}
