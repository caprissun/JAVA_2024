package ex04;

import ex05.Speaker3;

public class Computer {

Speaker3 sp3 = new Speaker3();


	public void powerOn() {
       
		sp3.powerOn();
		
	}
	
	public void powerOff() {
	  
		sp3.powerOff();
	}
	
	public void volumeUp() {
        sp3.soundUp();
	}
	
	public void volumeDown() {
        sp3.soundDown();
	}
	
}
