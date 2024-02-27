package ex01;

public class EqualsEx04 {

	public static void main(String[] args) {

		Box3 b1 = new Box3("korea");
		Box3 b2 = new Box3("korea");
	
	//	Box b1 = new Box("korea");
	//	Box b2 = new Box("korea");
		
		System.out.println("1 >>" +(b1 == b2));
		System.out.println("2 >>" +(b1.equals(b2)));
	}

}


class Box3{
	
    String str;
    public Box3(String str) {
    	this.str = str;
}
	@Override //equals 메소드 재정의 : 우클릭 > 소스 > 오버라이드
    
	public boolean equals(Object obj) { //b2가 obj로 전달
	 
	return str.equals(((Box3)obj).str);
		}
		
		
		
	}

    
	

