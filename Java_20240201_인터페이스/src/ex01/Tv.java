package ex01;
//implements 구현한다 (추상클래스)
public class Tv implements RemoteControl {

	@Override
	public void turnOn() {
	System.out.println("Tv를 켭니다.");
	}
}
