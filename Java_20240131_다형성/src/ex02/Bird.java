package ex02;

public class Bird extends Animal {

	@Override
	void makeSound() {
		super.makeSound();
		System.out.println("새 : 짹짹~");
	}

}
