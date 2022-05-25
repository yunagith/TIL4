package ch09_nested.sec03;

public class Button {
	
	
	// 인터페이스 타입으로 필드 선언
	OnClickListener listener;
	
	// Setter 메소드 : 구현 객체를 매개변수로 받아 필드에 대입
	// 매개변수가 인터페이스이면 다양한 구현 객체를 받을 수 있음 (다형성)
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	
	// 버튼 이벤트가 발생했을 때 호출되는 메소드
	void touch() {
		// 인터페이스를 통해 구현 객체의 메소드 호출
		listener.onClick();
	}
	
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
}
