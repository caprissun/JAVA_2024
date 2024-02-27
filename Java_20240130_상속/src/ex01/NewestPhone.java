package ex01;

public class NewestPhone extends Phone{
                         //Phone에게 상속받은 하위클래스
	
	private boolean wifi;
	
	public NewestPhone()
	{
		System.out.println("NewestPhone");
	}
	
	public NewestPhone(boolean wifi)
	{
		System.out.println("NewestPhone(boolean wifi)");

	}
	
	
	public void internet() {
		System.out.println("인터넷 연결!!");
	}
	public void youtube() {
		System.out.println("유튜브 연결!!");
	}
}


