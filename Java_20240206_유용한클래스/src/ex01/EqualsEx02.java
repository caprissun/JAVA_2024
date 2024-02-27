package ex01;

public class EqualsEx02 {

	public static void main(String[] args) {

	//	Box b1 = new Box(10);
	//	Box b2 = new Box(10);
	
		Box b1 = new Box("korea");
		Box b2 = new Box("korea");
		
		System.out.println("1 >>" +(b1 == b2));
		System.out.println("2 >>" +(b1.equals(b2)));
	}

}


class Box{
	//int x;              1. >>false
	//public Box(int x) { 2. >>false
	//	this.x = x;
    String str;
    public Box(String str) {
    	this.str = str;
}

}
