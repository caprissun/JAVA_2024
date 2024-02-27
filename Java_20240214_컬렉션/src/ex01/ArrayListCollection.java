package ex01;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
	
    //ArrayList 와 LinkedList는 사용방법이 같다. 
	//ArrayList 와 LinkedList 두 클래스 상위 클래스인 List를 사용	
		
 ArrayList<String> list = new ArrayList<String>();
 //LinkedList<String> list = new ArrayList<String>();
//List<String> list = new ArrayList<String>();
//문자열 인스턴스 저장
 list.add("Toy");
 list.add("Box");
 list.add("Robot");
// list.add(10); 타입이 맞지 않아 불가능
 //저장된 리스트 출력

 for(int i=0; i<list.size(); i++)
	 System.out.print(list.get(i) + " ");
 System.out.println();
		
 //향상된 for문 이용
 for(String str : list)
	 System.out.print(str + " ");
 System.out.println();
 //삭제
 list.remove(0); //0 > Toy
 // = System.out.println(list.get(0));
 //앞자리가 삭제되면 뒤 데이터들이 전부 앞으로 땡겨진다.
 //앞자리에 추가되면 뒤 데이터들이 전무 뒤로 밀려난다.
 //따라서 ArrayList는 빈번한 추가 및 삭제가  있는 경우 속도가 저하 될 수 있다.

 //향상된 for문 이용
for(String str : list)
	 System.out.print(str + " ");
	}

}
