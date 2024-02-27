package ex04;

class Box<T>{  //사과,오렌지 담는 상자
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
     public T get(){
		return obj;
	}
}


public class BoxEx01 {

	public static void main(String[] args) {

		
				
		Box<Integer> ibox = new Box<Integer>();
		ibox.set(123);
		
		int num =ibox.get();
		System.out.println(num);
	
	    System.out.println("-------------");
	    
		Box<Double> dbox = new Box<Double>();
		dbox.set(12.5);
		Double dNum =dbox.get();
		System.out.println(dNum);
		
			
		
	}

}
