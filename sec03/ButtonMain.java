package ch09_nested.sec03;

// ��ư �̺�Ʈ ó�� Ŭ����
public class ButtonMain {

	public static void main(String[] args) {
		// ��ø �������̽� ����
		
		Button btn = new Button();
		
		// ��ư Ŭ������ �� �̺�Ʈ ó��
		// OnClickListener ���� ��ü�� CallListener ��ü ����
		// ��ư Ŭ������ �� CallListener Ŭ������ �����ǵ� OnClick() ȣ��
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		// OnClickListener ���� ��ü�� MessageListener ��ü ����
		// ��ư Ŭ������ �� MessageListener Ŭ������ �����ǵ� OnClick() ȣ��
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		// �͸� ���� ��ü ���
		// ���� Ŭ������ ������ �ʰ�
		// ���� �͸� ���� ��ü�� �����ؼ� �̺�Ʈ ó���ϴ� ��� - �� ��찡 �� ����
		btn.setOnClickListener( new Button.OnClickListener() {
			
			//
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
				
			}
		});
		
		btn.touch();

	}

}
