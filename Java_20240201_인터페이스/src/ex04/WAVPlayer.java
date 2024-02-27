package ex04;

public class WAVPlayer implements MediaPlayer{

	private String filename;
	private Double runTime;
	private Double fileSize;
	public static int state; //-1(정지), 0(일시정지), -1(실행)
	
	@Override
	public void play() {
		state = 1;
		System.out.println("MP3 파일 재생 중...");
	}
	@Override
    public void pause(){
		state = 0;
    	System.out.println("MP3 파일 일시정지");
    }
    @Override
	public void stop(){
    	state = -1;
		System.out.println("MP3 파일  정지");
	}
	@Override
	public void loadFile(String file){
		System.out.println(file + "이 저장됨..");
	    System.out.println("loading....");
	}
}
