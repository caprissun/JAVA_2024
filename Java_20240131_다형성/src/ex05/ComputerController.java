package ex05;

public class ComputerController {

	public static void main(String[] args) {

    Speaker3 speaker = new Speaker3(); //내용이 많아져도 여기만 수정하면 다른값을 쓸 수 있음
  //Speaker speaker = new Speaker();   //상속이 되어있기 때문에 (다형성 활용)
  //Speaker2 speaker = new Speaker2();
  //Music speaker = new Music();
  //ChildSpeaker speaker = new ChildSpeaker();
    speaker.powerOn();
		   
    speaker.powerOff();
		   
    speaker.soundUp();
		   
    speaker.soundDown();
		   
		}
}