package com.javaex.ex02;

public class Sparrow extends Bird {
	
	public void setName(String name) {
		super.name="참새"+"("+name+")";
		
	}
	
	  public void sing() {
		  super.sing();
	    }
	  @Override
	    public void fly() {
	    System.out.printf("%s가 날아다닙니다.%n",name);
	    }
	    @Override
	    public void showName() {
	    	System.out.printf("참새의 이름은 %s 입니다.%n",name);
	    }

}
