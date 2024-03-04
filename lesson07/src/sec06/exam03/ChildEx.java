package sec06.exam03;

public class ChildEx {

	public static void main(String[] args) {

		//자식클래스 객체를 생성하면서 부모타입으로 자동타입변환
		Parent parent = new Child();
		
		//Parent 타입으로 사용
		parent.field = "데이터1";
		parent.method1();
		parent.method2();
		
//		부모 타입으로 변환했기 때문에 사용불가
//		parent.field2; 
//		parent.method3(); 
//		
//		자식 클래스 타입으로 강제 타입변환
		Child child = (Child) parent;
		child.field = "데이터1";
		child.method1();
		child.method2();
		
		child.field2 = "테이터2";
		child.method3();
	}

}
