package com.javaex.ex03;

public class Cat implements Soundable {

	public String sound() {
		String catSound = "야옹";
		return catSound;
	}
	
	public void printSound() {
		sound();
	}
}
