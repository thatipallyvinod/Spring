package com.sathya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private HomeloanService homeloanService;
	@Autowired
	private RealStateService realStateService;
	
	/*//Getters And Setters
	
	public HomeloanService getHomeloanService() {
		return homeloanService;
	}

	@Autowired
	public void setHomeloanService(HomeloanService homeloanService) {
		this.homeloanService = homeloanService;
	}


	public RealStateService getRealStateService() {
		return realStateService;
	}

	@Autowired
	public void setRealStateService(RealStateService realStateService) {
		this.realStateService = realStateService;
	}*/

	
	
	/*//Constructor
	 
	@Autowired
	public Person(HomeloanService homeloanService, RealStateService realStateService) {
		super();
		this.homeloanService = homeloanService;
		this.realStateService = realStateService;
	}*/



	public void details() {
		homeloanService.loanInfo();
		realStateService.realstateInfo();
	}
	
}
