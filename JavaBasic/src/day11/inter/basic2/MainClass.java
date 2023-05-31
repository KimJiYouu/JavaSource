package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {

//		객체 생성할 떄 추상 클래스로 형변환
//		추상 클래스 기능만 사용가능
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		Animal[] animals = { dog, cat, tiger };

		for (Animal ani : animals) {
			ani.eat(); // Animal의 기능
		}
		System.out.println("===============");
		// dog, cat은 인터페이스 타입으로 형변환이 됨
		// dog, cat, GoldFish를 저장하고 IPet의 기능을 사용하는 반복문
		IPet[] pets = new IPet[3];

		pets[0] = (IPet) dog;
		pets[1] = (IPet) cat;
		pets[2] = new GoldFish();

		for (IPet i : pets) {
			i.play();
		}
	}
}
