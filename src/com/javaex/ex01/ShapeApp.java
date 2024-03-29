package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//	1. Shape s = new Shape("빨강");
		//			->	추상 클래스(Shape)는 객체화 불가능함. 
		//	2. 추상 메소드를 Ractangle에서 구현하지 않아 오류남. 
		//			->	showInfo()를 draw()로 바꿔서 쓰게 해줘야 함. 
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		((Ractangle)sr1).getWidth();
	}
}

	
	