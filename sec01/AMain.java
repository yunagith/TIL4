package ch09_nested.sec01;

public class AMain {

	public static void main(String[] args) {
		// ��ø Ŭ���� ����
		
		// �ν��Ͻ� ��� Ŭ���� B ��ü �����ϱ� ���ؼ���
		// �ٱ� Ŭ���� A Ŭ������ ��ü ���� �ʿ�
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� B ��ü ����
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		// ���� ��� Ŭ���� ��ü ����
		// �ٱ� Ŭ���� A ��ü ���� �ʿ� ����
		// Ŭ���� A�� Ŭ���� �̸� ���
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		c.field2=3;
		c.method2();
		
		//���� Ŭ���� D ��ü ����
		// ���� Ŭ���� D�� A Ŭ������ ��� �޼ҵ� method() ���� ����Ǿ����Ƿ�
		// Ŭ���� D�� ��ü�� �����ϱ� ���ؼ���
		//method()�� ȣ���ؾ� ��
		a.method();

	}

}
