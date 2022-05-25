package ch09_nested.sec03;

// Button 클래스 안의 중첩 인터페이스를 구현한 클래스
public class CallListener implements Button.OnClickListener {
	
	// OnClickListener 인터페이스의 추상 메소드 재정의
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
