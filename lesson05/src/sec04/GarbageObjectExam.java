package sec04;

public class GarbageObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String hobby = "여행" ; //  힙영역에 "여행" 이라는 객체가 생성되고 주소가 hobby에 할당
				hobby = null ; // 여행이라는 String 객체가 쓰레기가됨
				
				String bestCar = "스포티지";
				String worstCar = bestCar; //bestCar 에 저장된 스포티지 객체 번지를 worstCar에 대입
				bestCar = null; // bestCar쓰레기가됨      '스포티지' 객체의 상황은????? 남아있음  
				
				System.out.println(worstCar);
		}

}
