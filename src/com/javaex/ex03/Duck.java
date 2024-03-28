package com.javaex.ex03;

public class Duck implements Soundable {

	public String sound() {
		String duckSound = "꽥꽥";
		return duckSound;
	}
	public void printSound() {
		sound();
	}
}
