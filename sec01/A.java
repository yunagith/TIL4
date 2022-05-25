package ch09_nested.sec01;

public class A {
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	// �ν��Ͻ� ��� Ŭ����
	public class B{
		B(){ 
			System.out.println("B ��ü�� ������");}
		
		int field1;
		void method1() {}
		//static int field2; // static ��� �ʵ�� �޼ҵ� ���� �Ұ�
		//static void method2() {}
		
	}
	// ���� ��� Ŭ����
	static class C {
		C() { System.out.println("C ��ü�� ������"); }
		
		// ��� ������ �ʵ�, �޼ҵ� ���� ����
		int field1;
		static int field2;
		void method1() {}
		static void method2() { }
	}
	public void method() {
		// ���� Ŭ���� : �޼ҵ� ���� ����
		class D{
			D() {System.out.println("B ��ü�� ������"); }
			
			// �ν��Ͻ� �ʵ�� �޼ҵ常 ���� ����
			// static �ʵ�� �޼ҵ� ���� �Ұ�
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
