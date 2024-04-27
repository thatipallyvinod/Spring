package com.sathya.springex1;

public class OneMoreImpl implements Onemore{

	@Override
	public void once() {
		// TODO Auto-generated method stub
		System.out.println("OnceMore With Spring Example");
	}
	
	public  OneMoreImpl (){
		System.out.println("Spring Bean Created Once More");
	}

}