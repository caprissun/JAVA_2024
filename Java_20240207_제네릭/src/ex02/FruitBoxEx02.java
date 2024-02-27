package ex02;


/*
 * 이 코드 문제점(?)
 * 1.AppleBox, OrengeBox 거의 비슷
 * 2. 한박스에 사과, 오렌지 같이 담을 수 없음
 * 3.get할 때 형변환 해야한다. (다운캐스팅 해야한다.)
 */

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orenge{
	public String toString() {
		return "I am an orenge";
	}
}
		class Box{ //사과,오렌지 같이 담는상자
			 private Object obj;
			 
			 void setobj(Object obj) {
			     this.obj = obj;
			
			}
			 Object getobj() {
				 return obj;
			 }
		}
		

	
public class FruitBoxEx02 {

	public static void main(String[] args) {

	Box abox = new Box();
	Box bbox = new Box();
	abox.setobj(new Apple()); //사과 담음
	bbox.setobj(new Orenge()); //오렌지 담음
    
	Apple ap =(Apple)abox.getobj();
	Orenge op =(Orenge)bbox.getobj();
	
	System.out.println(ap);
	System.out.println(op);
	
	abox.setobj(10);
	abox.setobj(1.2);
	abox.setobj("String");
    }

}
