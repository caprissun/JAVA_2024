package ex01;

public class Ex01 {

	public static void main(String[] args) {
        
		
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv 객체 배열
		
		//Tv객체를 생성해서 Tv객체 배열의 각요소에 저장
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을저장
		
		}
	
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();//tvArr[i]의 메서드 호출, 채널이 1 증가
		    System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
	}
	}

}
class Tv{
	String color;   //색상
	boolean power;  //전원상태(on/off)
	int channel;    //채널
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

