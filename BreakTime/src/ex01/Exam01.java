package ex01;

//다형성 : 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질
//다형성을 통해 조상 클래스의 참조 변수로 자손 클래스의 참조 변수를 다루거나, 동일한 이름으로 같은 여러 형태의 매소드를 만들 수 있다.
//자바에서 대표적으로 오버로딩,오버라이딩,업캐스팅,다운캐스팅,인터페이스,추상메소드,추상클래스 방법이 모두 다형성에 속한다.
//즉 다형성을 클래스가 상속관계에 있을 댸 나타나는 다채로운 성질이다.
class A{
	void funA(){
		System.out.println("funA");
	}
	void funD() {
		System.out.println("A - funD");
	
	}
}

class B extends A{
	void funB(){
		System.out.println("funB");
	}
	void funD() {
		System.out.println("B - funD");
	
	}
}

class C extends B{
	void funC(){
		System.out.println("funC");
	}
	void funD() {
		System.out.println("C - funD");
	
	}
}

public class Exam01 {
                         // A객체 B객체 C객체 가능
	static void testFunc(A a) {
		//funA, funB, funC를 출력하려면 어떻게 ?
		
		if(a instanceof C) { 
		((C)a).funC();
		//	C c = (C)a;
		//    c.funC();
		    }
		else if (a instanceof B) { 
		((B)a).funB();
		//	B b = (B)a;
		//	b.funB();
			}
		else a.funA();
	}
	
	public static void main(String[] args) {
		
		//상위 클래스는 하위 클래스 참조가능
		//하위 클래스는 상위 클래스 참조불가
		
		//상위 클래스는 하위 클래스 자원 접근 불가
		//하위 클래스는 상위 클래스 자원 접근 가능
		//단, 하위 클래스가 상위클래스 자원(메소드)을 재정의 하면 그 땐가능함
		
		
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		a1.funD(); //a1이 참조하고 있는 대상 A  > A에 있는 funD값을 호출
		a2.funD();
		a3.funD();
		
		//B b1 = new A(); 하위 클래스는 상위 클래스 참조불가
		//왜? = 상위클래스인 A의 멤버 개수보다 참조변수인 B가 사용할 수 있는 멤버 개수가 더 많기 때문에
		B b2 = new B();
		B b3 = new C();
		
		//C c1 = new A(); 불가 //왜? = 상위 클래스인 A의 멤버 개수보다 참조변수인 C가 사용할 수 있는 멤버 개수가 더 많기 때문에
		//C c2 = new B(); 불가 //왜? = 상위 클래스인 B의 멤버 개수보다 참조변수인 C가 사용할 수 있는 멤버 개수가 더 많기 때문에
		C c3 = new C();
		
		//강제 타입 변환
        A aa1 =new B();
		// B bb1 = aa1; 불가 > 왜? 형변환 안되서 내용물이 많은것을 작은것으로 집어 넣으려고 할때 형변환 필요 ex)double = (double)int
        B bb2 =(B)aa1;  //가능 > 왜?		
        
        A aa2 =new C();		
        C cc1 =(C) aa2; // 가능 > 왜 ?
	
	    System.out.println("-----------------");
	
	    testFunc(new A());	    
	    testFunc(new B());	    
	    testFunc(new C());	    
	}
	
	
	
}