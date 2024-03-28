package com.javaex.ex03;

public class Dog implements Soundable {

	public String sound() {
		String dogSound = "멍멍";
		return dogSound;
		
	}
	public void printSound() {
		sound();
	}
}
