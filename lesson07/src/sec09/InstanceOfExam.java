package sec09;

public class InstanceOfExam {
   
   //메서드 -- main()에서 바로 호출하기 위해 정적멤버로 선언
   // 매개변수로 Person이라는 클라스를 사용한것이 다형성이다 
   // 어렵게 생각말고 Person이 Int같은 것이라고 생각하자.
   public static void personInfo(Person person) {
      System.out.println("name :" + person.name);
      person.walk();
   
   
   //person이 student 타입인지 확인
   if(person instanceof Student) {
      //Student 객체일 경우 강제 타입 변환
      Student student = (Student) person;
      //Student 객체만 가지고 있는 필드 및 메서드 사용
      System.out.println("StudentNo :" + student.studentNo);
      
      student.study();
       }
   }

   /*
    * java 12 이상일 경우 person이 참조하는 객체가 student 타입일 경우 바로 student 대입
    *  if(person instanceof Student student){
    *       System.out.println("StudentNo :" + student.studentNo);
           student.study();
    *  }
    */
   
   public static void main(String[] args) {
      //person 객체를 매개값으로 제공하고 바로 personInfo() 메서드 호출
      Person p1 = new Person("홍길동"); // 부모(person) 생성자가 사용된다.
      personInfo(p1);
      
      System.out.println();
      
      Person p2 = new Student("안철수", 10);
      personInfo(p2); // 자식(student) 생성자가 사용된다.
      

   }

}