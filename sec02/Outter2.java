package ch09_nested.sec02;

public class Outter2 {
	String field = " Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	//��ø Ŭ����
	class Nested {
		String field = " Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// ��ø ��ü ����
			System.out.println(this.field);
			this.method();
			
			// �ٱ� ��ü ���� : �ٱ�Ŭ����.this.���
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
}
