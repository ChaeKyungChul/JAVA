package sec05;

public class Student {
		//필드   : 객체의 데이터가 저장되는곳 
	
	int age;              //철수 입력해서바꿀수있지만 안좋음 
	String name;		 // 나이 입력해서바꿀수있지만 안좋음
	int grade;				 // 4 입력해서바꿀수있지만 안좋음
		//생성자 Student(){}   : 객체생성시 초기화 역활 담당 // 생성자는 생략가능 자동생성해줌 <작업하는것
	Student(int age, String name, int grade){
		this.age = age;  // this 필드값초기화시켜주는것  , ㅡ> age 매개값
		this.name = name;
		this.grade = grade;
	}
	
	
	
	
	
		//메소드  : 객체의 동작으로 호출시 실행되는 곳
	public void stydy() {
		System.out.println("수업시간에는 공부를 열심히 합니다.");
	}
	public void home() {
		System.out.println("수업이 끝나면 집에 갑시다 메롱.");
	}
	
	}

