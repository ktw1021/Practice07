package com.javaex.ex02;

public abstract class Bird {
    
	protected String name;

    protected String getName() {
    	return name;
    }
	
	public void setName(String name) {
    	this.name=name;
    }
    
    
    public Bird() {
    	
    }

    public void fly() {
    	
    }
    
    public void sing() {
    	System.out.printf("%s가 소리내어 웁니다.%n",name);
    }
    
    public void showName() {
    	
    }
    
}
