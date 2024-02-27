package ex02;

public class Phone {
   
	//상위 클래스(부모클래스) (눈에 보이지 않지만 오브젝트에서 상속받음-모든클래스)
	private String model;
	private String color;
	
	public Phone()
	{
		System.out.println("Phone()");
	}
	
	public Phone(String model, String color)
	{
		System.out.println("Phone(String model, String color)");
		this.model = model;
		this.color = color;
	}
	
	
	
	@Override //우클릭 소스 >투 스트링
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}

	public void bell() {
		System.out.println("전화 벨이 울린다.");
    }
	
	public void sendVoice(String message) {
		System.out.println("자신 : " + message);
	}
	
	public void receiveVoice(String message) {
	    System.out.println("상대방 : " + message);
	
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}

