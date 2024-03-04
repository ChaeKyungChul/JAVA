package sec09;

public class Student extends Person{
               //필드
           public int studentNo;        
           //생성자
           
           public Student(String name, int studentNo) {
                super(name);
                this.studentNo = studentNo;
           }
           
           //메서드
           
           public void study() {
              System.out.println("공부를 합니다.");
           }
   

}
