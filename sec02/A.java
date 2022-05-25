package ch09_nested.sec02;

public class A {
	// 인스턴스 멤버 클래스 : 인스턴스 필드 초기화 가능
	B field1 = new B();
	// 정적 멤버 클래스 : 인스턴스 필드 초기화 가능
	C field2 = new C();
	
	void method1() {
		// 인스턴스 멤버 클래스 : 인스턴스 메소드 내에서 객체 생성 가능
		B var1= new B();
		// 정적 멤버 클래스 : 인스턴스 메소드 내에서 객체 생성 가능
		C var2 = new C();
	}
	// 정적 필드 초기화
	// 인스턴스 멤버 클래스 : 정적 필드 초기화 불가
	//static B field3 = new B();
	// 정적 멤버 클래스 : 정적 필드 초기화 가능
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		//인스턴스 멤버 클래스 : 정적 메소드에서 객체 생성 불가
		//B var1 = new B();
		// 정적 멤버 클래스 : 정적 메소드에서 객체 생성 가능
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B { }
	
	// 정적 멤버 클래스
	static class C { }
}
