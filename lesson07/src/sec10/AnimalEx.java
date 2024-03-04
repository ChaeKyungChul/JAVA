package sec10;

public class AnimalEx {

	public static void main(String[] args) {

//		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breath(); // animal 메소드
		cat.sound();
		
		dog.breath();
		dog.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
		//다형성을 이용해 출력
		public static void animalSound(Animal animal) {
			animal.sound();
		}
	}


