package ex01;

public class RemoteControlExample {

	static int count = 0; //정적변수 객체생성없이 바로 사용가능
	
	public static void main(String[] args) {
           Tv tv = new Tv(); //Audio
	//Object or 상위클래스     =  하위클래스 하위클래스만 바꿔도 정상 동작
	tv.turnOn();
	
	
	
	int sum = 0; //인스턴스 변수 : 객체를 생성해야지만 쓸 수 있는 변수
	
	System.out.println(RemoteControlExample.count);
	System.out.println(sum);
	
	
	}

}
