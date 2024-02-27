package ex02;

public class AnimalController {

	public static void main(String[] args) {
		
     /* 동물원 시뮬레이션
        main 메소드에서 각기 다른 종류의 동물들을 생성합니다.
        생성된 각 동물에 대해 makeSound()를 호출하여 해당 동물의 소리를 출력합니다.
       
      * ->makeSound(); 이 반복 되므로 다형성을 만족하지않음
      * Bird b = Bird();
		b.makeSound();
		
		Dog  d = Dog();
		d.makeSound();
        
		Cat  c = Cat();
        c.makeSound(); */	
	    sound(new Bird());
	    sound(new Cat());
	    sound(new Dog());
	
	
	}
	
    static void sound(Animal animal) {
    	animal.makeSound();
    }
	
	
	
	
	
}
