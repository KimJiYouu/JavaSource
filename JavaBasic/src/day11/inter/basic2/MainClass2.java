package day11.inter.basic2;

public class MainClass2 {
	public static void main(String[] args) {
		
		IPet d = new Dog();
		IPet c = new Cat();
		IPet f = new GoldFish();
		PetHouse.carePet(d);
		PetHouse.carePet(c);
		PetHouse.carePet(f);
		
		System.out.println("=========");
		
		Animal dd = new Dog();
		Animal cc = new Cat();
		PetHouse.carePet((IPet)dd);
		PetHouse.carePet((IPet)cc);
	}
}
