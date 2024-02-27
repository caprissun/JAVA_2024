package ex03;

public class MediaPlayerController {

	public static void main(String[] args) {

		MediaPlayer player = new WAVPlayer();
		player.play();
		
		player = new MP3Player();
		player.play();
		
		player = new FLACPlayer();
		player.play();
	}

}
