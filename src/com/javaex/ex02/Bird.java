package com.javaex.ex02;

public abstract class Bird {
    
	private String name;

    protected String getName() {
    	return name;
    }
	
	protected void setName(String name) {
    	this.name=name;
    }
    
    
    public Bird() {
    	
    }

    public abstract void fly();
    
    public abstract void sing();
    
    public abstract void showName();
    
}
