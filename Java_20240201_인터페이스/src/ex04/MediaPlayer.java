package ex04;

public interface MediaPlayer {



public void play();
	
public void pause();

public void stop();

default void loadFile(String file) {
	System.out.println("파일로딩중....");
}

 
	}


