package com.javaex.ex01;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape s = new Shape("빨강");
		//	추상 클래스(Shape)는 객체화 불가능함. 
		//	추상 메소드를 Ractangle에서 쓰지 않아서 오류남. 
		//	showInfo를 draw로 바꿔서 쓰게 해줘야 함. 
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 4, 4);
		
		//sr1을 그리는 메소드 호출
		sr1.draw();
		//sr1의 가로크기 출력
		((Ractangle)sr1).getWidth();
	}
}

	
	