package ex02;

public class WrapperEx01 {

	public static void main(String[] args) {
       //기본자료형 8개 빼고는 전부다 객체다.
		
		int i =10;
		
		Integer iref = new Integer(10);
		
		Integer iref2 = 20; // 자바 컴파일러가 new Integer(20); 이런식으로 자동으로 바꿔줌
		                    // 바꿔주는 과정 = 랩퍼 
	    i = iref2; //iref <주소값  ex String s = "kor"
	               //               에서 s 는 주소값을 나타냄
	    // =>iref2 객체 > 기본자료형으로 변경해야함
	    
	    i =iref2; //= iref2.intValue(); // = Integer -> int
	    iref = i; // new Integer(i); 로 오토박싱

	   // 객체를 기본자료형으로 푸는것을 언박싱
	   // 자료형을 객체로 바꾸는것이 오토박싱
	}                       
	
	
	

}
