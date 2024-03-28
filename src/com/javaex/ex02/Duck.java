package com.javaex.ex02;

public class Duck extends Bird {
	
	public void setName(String name) {
		super.name="오리"+"("+name+")";
		
	}
	
    public void sing() {
    	super.sing();
    }
    @Override
    public void fly() {
    	 System.out.printf("%s가 날지 않습니다.%n",name);
    }
    @Override
    public void showName() {
    	System.out.printf("오리의 이름은 %s 입니다.%n",name);
    }

}
