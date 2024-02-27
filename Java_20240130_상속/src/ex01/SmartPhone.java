package ex01;

public class SmartPhone extends Phone{
	          //Phone에게 상속받은 하위클래스(자식)
	//하위클래스가 항상 상위클래스와 같거나 더 큼
	private boolean wifi;
	
	public SmartPhone()
	{
		System.out.println("SmartPhone");
	}
	
	public SmartPhone(boolean wifi)
	{
		System.out.println("SmartPhone(boolean wifi)");
	    this.wifi = wifi;
	}
	
	
	
	
	@Override
	public String toString() {
		System.out.println(super.toString());//상위클래스 메소드(to String) 호출
		return "SmartPhone [wifi=" + wifi + "]";
	}

	
	public void internet() {
		System.out.println("인터넷 연결!!");
	}
}


//extends = 확장  : 기능 추가, 확장시킨다