package ch09_nested.sec03;

public class Button {
	
	
	// �������̽� Ÿ������ �ʵ� ����
	OnClickListener listener;
	
	// Setter �޼ҵ� : ���� ��ü�� �Ű������� �޾� �ʵ忡 ����
	// �Ű������� �������̽��̸� �پ��� ���� ��ü�� ���� �� ���� (������)
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	// ��ư �̺�Ʈ�� �߻����� �� ȣ��Ǵ� �޼ҵ�
	void touch() {
		// �������̽��� ���� ���� ��ü�� �޼ҵ� ȣ��
		listener.onClick();
	}
	
	// ��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
}
