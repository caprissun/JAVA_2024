package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;





public class ListCollection {

	public static void main(String[] args) {
	
		
	//중복되지 않는다, 순서가 없다.
		
	//	list<String> list = new Hashlist<String>();
        List<String> list = new ArrayList<String>(); //코드 같이 사용가능
		
		//문자열 인스턴스 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		Iterator<String> it = list.iterator(); //반복자
	
	    while(it.hasNext()) {
	    	System.out.print(it.next() + '\t');
	    }
	System.out.println();
	}

}


//출력 값 : Box	Robot	Toy	 >> 중복되지 않고 입력한 순서대로 출력.