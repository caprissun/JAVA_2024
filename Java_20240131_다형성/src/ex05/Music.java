package ex05;
//우빈
public class Music extends Speaker {

	   public Music() {
	   }

	   @Override
	   public void powerOn() {
	      System.out.println("전원on.");
	   }
	   
	   @Override
	   public void powerOff() {
	      System.out.println("전원off.");
	   }
	   
	   @Override
	   public void SoundUp() {
	      System.out.println("사운드up.");
	   }
	   
	   @Override
	   public void SoundDown() {
	      System.out.println("사운드down.");
	   }
	   
	}