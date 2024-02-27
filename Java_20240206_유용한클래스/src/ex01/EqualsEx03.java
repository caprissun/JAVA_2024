package ex01;

public class EqualsEx03 {

	public static void main(String[] args) {

		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);
	
	//	Box b1 = new Box("korea");
	//	Box b2 = new Box("korea");
		
		System.out.println("1 >>" +(b1 == b2));
		System.out.println("2 >>" +(b1.equals(b2)));
	}

}


class Box2{
	int x;             
	public Box2(int x) {
		this.x = x;
    //String str;
    //public Box2(String str) {
    //	this.str = str;
}
	@Override //equals 메소드 재정의 : 우클릭 > 소스 > 오버라이드
    
	public boolean equals(Object obj) { //b2가 obj로 전달
	
		if(obj instanceof Box2) {
			return  x == ((Box2)obj).x;
			             //형변환 
		}
		
		return super.equals(obj);
		
	}

    
	
}
