package com.sathya.springex;

public class Travelar {

		private String name;
		private String email;
		private long phno;
		Vehicle vehicle;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public Vehicle getVehicle() {
			return vehicle;
		}
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
		
		public void startjourney() {
			
			System.out.println("hey "+name+" Welcome to Traveling");
			System.out.println("Check Your Mobile: "+phno+" Email: "+email);
			vehicle.move();
		}
}
