package ex02;

public class Cat extends Animal {

	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("고양이 : 야옹~");
	}

}
