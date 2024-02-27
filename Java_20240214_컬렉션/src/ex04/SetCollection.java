package ex04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetCollection {

	public static void main(String[] args) {
	
		
	//중복되지 않는다, 순서가 없다.
		
		Set<String> set = new HashSet<String>();
      // List<String> set = new ArrayList<String>(); 코드 같이 사용가능
		
		//문자열 인스턴스 저장
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		
		Iterator<String> it = set.iterator(); //반복자
	
	    while(it.hasNext()) {
	    	System.out.print(it.next() + '\t');
	    }
	System.out.println();
	System.out.println("한번 더 출력");
	
	it = set.iterator();
	while(it.hasNext()) {
    	System.out.print(it.next() + '\t');  //한번 더 출력 하려면 반복자 한번 더 써야함
    }
	}

}
//출력 값 : Box	Robot	Toy	 >> 중복되지 않고 입력한 순서대로 출력.


// iterator 공통적으로 사용가능