package ex01;

public class EqualsEx01 {

	public static void main(String[] args) {

		String str1 = new String("korea");
		String str2 = new String("korea");
		
		System.out.println(str1 == str2);
		//false인 이유 = 주소값 비교기 때문에

		System.out.println(str1.equals(str2));
		//true인 이유 =참조주소 안의 값을 비교
	}

}
