package ch09_nested.sec02;

public class Outter2 {
	String field = " Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	//ÁßÃ¸ Å¬·¡½º
	class Nested {
		String field = " Nested-field";
		
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// ÁßÃ¸ °´Ã¼ ÂüÁ¶
			System.out.println(this.field);
			this.method();
			
			// ¹Ù±ù °´Ã¼ ÂüÁ¶ : ¹Ù±ùÅ¬·¡½º.this.¸â¹ö
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
}
