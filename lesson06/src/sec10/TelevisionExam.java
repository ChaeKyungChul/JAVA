package sec10;

public class TelevisionExam {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		//info를 출력하시오.
		System.out.println(Television.info);   //정적이기떄문에 바로 가능 따로선언 안해도됨
		
		Television.method2();
		
		System.out.println();
		tv.method(500000);
	}

}
