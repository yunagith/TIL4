package ch09_nested.sec01;

public class AMain {

	public static void main(String[] args) {
		// 중첩 클래스 예제
		
		// 인스턴스 멤버 클래스 B 객체 생성하기 위해서는
		// 바깥 클래스 A 클래스의 객체 생성 필요
		A a = new A();
		
		//인스턴스 멤버 클래스 B 객체 생성
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		// 바깥 클래스 A 객체 생성 필요 없이
		// 클래스 A로 클래스 이름 사용
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		c.field2=3;
		c.method2();
		
		//로컬 클래스 D 객체 생성
		// 로컬 클래스 D는 A 클래스의 멤버 메소드 method() 내에 선언되었으므로
		// 클래스 D의 객체를 생성하기 위해서는
		//method()를 호출해야 함
		a.method();

	}

}
