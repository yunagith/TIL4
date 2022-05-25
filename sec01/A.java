package ch09_nested.sec01;

public class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	public class B{
		B(){ 
			System.out.println("B 객체가 생성됨");}
		
		int field1;
		void method1() {}
		//static int field2; // static 멤버 필드와 메소드 생성 불가
		//static void method2() {}
		
	}
	// 정적 멤버 클래스
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		
		// 모든 종류의 필드, 메소드 선언 가능
		int field1;
		static int field2;
		void method1() {}
		static void method2() { }
	}
	public void method() {
		// 로컬 클래스 : 메소드 내에 선언
		class D{
			D() {System.out.println("B 객체가 생성됨"); }
			
			// 인스턴스 필드와 메소드만 선언 가능
			// static 필드와 메소드 선언 불가
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() { }
		}
		D d =new D();
		d.field1=3;
		d.method1();
	}
	
	
	
}
