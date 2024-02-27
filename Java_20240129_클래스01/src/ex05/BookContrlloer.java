package ex05;

public class BookContrlloer {

	public static void main(String[] args) {

		Book book1 = new Book(
				"JAVA 기본",
				"송미영",
				30000
				);
		
		book1.displayBookInfo();
		
		System.out.println("--------------");
		Book book2 = new Book();
		book2.displayBookInfo();

		System.out.println("--------------");
		Book book3 = new Book();
		book3.displayBookInfo();
	}

}
/*this 용도 = title = title 일 때 앞에 this를 붙혀 객체 자신을 의미하게하는용도
          = this.title = title    구별하기위해
*/