package sec04;

public class GenExam3 {

	public static<T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}

	
	//실행 메소ㄷ
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		int intValue = box1. get();
		System.out.println(intValue);
		
		//제네릭 메소드를 String 타입으로 호출 홍길동을 담으세요
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
