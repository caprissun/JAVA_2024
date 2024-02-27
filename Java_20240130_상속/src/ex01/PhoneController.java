package ex01;

public class PhoneController {

	public static void main(String[] args) {
		
//	Phone phone = new Phone(); //객체생성

	
//	SmartPhone sp = new SmartPhone();
	
//	NewestPhone np = new NewestPhone();
	
	// sp. >>Phone에 있는것 접근가능
	// np. >>Phone에 있는것 접근가능
	//4개 클래스에 생성자 만들지 않았기 때문에 기본 생성자 작동
	//기본생성자 생성시 부모클래스를 먼저 생성하고 그 다음 자신의 생성자 생성
	/* Phone
	 * SmartPhone -
	 * Phone
	 * NewestPhone 
	 */
	
	//	Phone phone = new Phone("m1", "흰색");
	//1	System.out.println(phone.toString());
	//2	System.out.println(phone);
	//1,2 같은 기능	
		
		SmartPhone sp = new SmartPhone(true);
        System.out.println(sp.toString());
		
	}

}
