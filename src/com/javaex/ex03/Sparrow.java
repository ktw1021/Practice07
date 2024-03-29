package com.javaex.ex03;

public class Sparrow implements Soundable {

	public String sound() {
		String sparrowSound = "짹짹";
		return sparrowSound;
		
	}

	@Override
	public void printSound() {
		sound();
	}
}
