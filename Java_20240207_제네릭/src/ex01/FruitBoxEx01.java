package ex01;

/*
 * 이 코드 문제점(?)
 * 1.사과랑 오렌지만 담고 싶은데 다른걸 담아도 제거불가
 * 2. 한박스에 사과, 오렌지 같이 담을 수 없음
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
		class AppleBox{
			 private Apple ap;
			 
			 void setAp(Apple ap) {
			     this.ap = ap;
			
			}
			 Apple getAp() {
				 return ap;
			 }
		}
		

				class OrengeBox{
					 private Orenge op;
					 
					 void setOp(Orenge op) {
					     this.op =op;
					
					}
					 Orenge getOp() {
						 return op;
					 }
				}
public class FruitBoxEx01 {

	public static void main(String[] args) {

		AppleBox aBox = new AppleBox(); 
		OrengeBox oBox = new OrengeBox();
		
		aBox.setAp(new Apple());
		oBox.setOp(new Orenge());
		
		System.out.println(aBox.getAp());
		System.out.println(oBox.getOp());
	}

}
