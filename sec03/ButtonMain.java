package ch09_nested.sec03;

// 버튼 이벤트 처리 클래스
public class ButtonMain {

	public static void main(String[] args) {
		// 중첩 인터페이스 예제
		
		Button btn = new Button();
		
		// 버튼 클릭했을 때 이벤트 처리
		// OnClickListener 구현 객체로 CallListener 객체 전달
		// 버튼 클릭했을 때 CallListener 클래스에 재정의된 OnClick() 호출
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		// OnClickListener 구현 객체로 MessageListener 객체 전달
		// 버튼 클릭했을 때 MessageListener 클래스에 재정의된 OnClick() 호출
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		// 익명 구현 객체 사용
		// 구현 클래스를 만들지 않고
		// 직접 익명 구현 객체를 대입해서 이벤트 처리하는 경우 - 이 경우가 더 많음
		btn.setOnClickListener( new Button.OnClickListener() {
			
			//
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
				
			}
		});
		
		btn.touch();

	}

}
