package ex04;

import java.util.Scanner;

public class MediaPlayerController {

	public static void main(String[] args) {

		MediaPlayer player = new FLACPlayer();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(MP3Player.state != -1) {
			System.out.println("1 : 플레이 실행, 0 : 일시정지, -1 : 정지 ==>정지");
			
			switch(sc.nextInt()){
			case 1 :
			player.play();
			break;
			
			case 0 :
			player.pause();
			break;
			
			case-1 :
			player.stop();
			break;		
		}
		}
		
System.out.println("play stop......");
	}

}
