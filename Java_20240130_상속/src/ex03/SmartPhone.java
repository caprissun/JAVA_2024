package ex03;

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
	
	public SmartPhone(String model, String color, boolean wifi) {
	super(model,color); //상위클래스 생성자 호출
	System.out.println("String color, (boolean wifi)");	
	this.wifi = wifi;
	}
	 @Override //어노테이션 sendVoice는 상위클래스를 재정의한다.
	public void sendVoice(String message) { 
		System.out.println("음성메세지 : " + message);
	} //오버라이드가 붙어있을 때 (ex)센드보이스는 반드시 상위클래스에 존재해야한다.
	  //프로그램 안정성 높아짐 실수확률 낮아짐.(오타방지, 직관성높힘)
	
	
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