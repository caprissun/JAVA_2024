package ex01;
//==public abstract class RemoteControl
public interface RemoteControl {
	//인터페이스 = 추상클래스

	//public static final int MAX = 100;	
	int MAX = 100;
	//public static final  생략된 상태
	//인터페이스에서는 앞에 무조건 붙어 있는상태 
	//public static final int MAX = 100;
	//메소드 선언부만 써도 쓸 수 있음 ex)int MAX = 100; / 
	public void turnOn(); //추상메소드

	/*인터페이스의 메소드들은 반드시 재정의 해야 하는데
	 * default 메소드가 앞에 붙으면 재정의 해도 되고 안해도 된다.
	 */
	
	
	
	
	
}
