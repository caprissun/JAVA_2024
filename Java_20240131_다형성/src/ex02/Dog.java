package ex02;

public class Dog extends Animal {

	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("개 : 멍멍~");
	}

}
