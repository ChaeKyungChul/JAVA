package sec04;

public class AnimExam {

	public static void main(String[] args) {
		Animal aa = new Animal(); // 부모클래스
		Bird bb = new Bird(); //부모클래스를 상속받은 자식클래스
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); // 부모 클래스의 cry() 메소드를 자식들이 자신에 맞게 오버라이딩해서 사용함.
		bb.cry();
		cc.cry();
		dd.cry();

	}

}
