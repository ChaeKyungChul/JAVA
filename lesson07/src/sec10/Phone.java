package sec10;

   //추상클래스
   //추상클래스는 직접 객체를 만들지 못한다.
public abstract class Phone {

   //필드 
   String owner;
   
   //생성자
   
   Phone(String owner){
      this.owner = owner;
   }
   
   //메서드
   //부모는 선언만 해놓고 자식들이 실체화한다 = 무조건 메서드 오버라이드 된다.
   //abstract 리턴타입 메서드이름(매개변수); -> 실행 영역{} 을 만들지 않는다.
   void turnOn() {
      System.out.println("폰의 전원을 켭니다.");
   }
   void turnOff() {
      System.out.println("폰의 전원을 끕니다.");
   }
   
}