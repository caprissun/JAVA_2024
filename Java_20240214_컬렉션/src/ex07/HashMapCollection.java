package ex07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapCollection {

	public static void main(String[] args) {
		

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(33, "Toy");
		map.put(47, "Box");
		map.put(67, "Robot");
		
	//반복해서 출력할때
		
		System.out.println(map.get(33)); //33에 해당하는 Toy 출력
		System.out.println("---------------");
		
	Set<Integer> set = map.keySet();   //키만 모아서 set 저장한다. (33,47,67묶어서 set에 저장)
	
	Iterator<Integer> it = set.iterator(); //>> iterator = 한줄로 세우고 it 이라는 반복자가 가리키고있음
	while(it.hasNext()) //반복
		System.out.print(map.get(it.next()) + '\t');
	}

}
