package ch09_nested.sec03;

public class MessageListener implements Button.OnClickListener{
	
	// OnClickListener 인터페이스의 추상 메소드 재정의
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
	
}
