package ex01;

public class Tests {

	public static void main(String[] args) {

		
		
		new Sample();
		new Sample();
		new Sample();
		new Sample();
	    new Sample();  //Sample s = new Sample();
		
	System.out.println(Sample.count); //s.count
	}

}


class Sample{   //static없으면 1출력 있으면 5 출력
	static int count;
	
	public Sample() {
		count++;
	}
	
}