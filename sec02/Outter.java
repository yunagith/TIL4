package ch09_nested.sec02;

public class Outter {
	public void method2(final int arg1, int arg2) {
		final int lovalVariable1=1;
		
		//arg1 =100; // ���� �Ұ�
		//lovalVariable1 = 100; // ���� �Ұ�
		
		// arg2 = 200;
		
		class Inner{
			public void method() {
				int result = arg1 + lovalVariable1;
				//�޼ҵ��� �Ű����� (arg1)�� ���� ���� (lovalVariable1)��
				// final�� �پ����Ƿ�
				// ���� Ŭ�������� ��� ����
				// arg 2 : final�� �� �پ�����
				// ���� Ŭ���� ���η� ����Ǿ� final Ư���� ���� �Ǿ ���� ����
			}
		}
	}
}
