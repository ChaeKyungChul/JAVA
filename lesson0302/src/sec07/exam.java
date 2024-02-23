package sec07;

public class exam {

	public static void main(String[] args) {
		
//		1.  다음 코드를 실행했을 때 출력 결과를 작성해보세요.
		 int x = 6;
		 int y = 3;
		 int z = (++x) + (y--);
		 System.out.println(z);   //31

//       2.		. 다음 코드를 실행했을 때 출력 결과를 작성해보세요
		 int score = 85;
		 String result = (!(score>90))? "가":"나";  //!=false ,  스코어>90 false = true
		 System.out.println(result);   //나
		 
//		 3. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇 개를 가질 수 있고, 
//		 마지막에 몇 개가 남는지를 구하는
		 
		 int pencils = 534;
		 int students = 30;
		 //학생 한 명이 가지는 연필 수    534/30
     //  	int pencilsPerStudent = ( PerStudent   /     pencils     ); 
		//System.out.println(pencilsPerStudent);
		 //남은 연필 수
	//	int pencilsLeft = (                   );
     //   System.out.println(pencilsLeft);
		 
		 
//4. 다음은 십의 자리 이하를 버리는 코드입니다. 변수 value의 값이 356이라면 300이 나올 수 있도
//		 록 (  )에 알맞은 코드를 작성하세요(산술 연산자만 사용).
		 
		 // 356 / 100   인티져 ㅡ>값변환 ㅡ> 곱하기100
		 // value / 100 * 100
		 int value = 356;
		 int value2 = 56;
		 System.out.println( value - value2 );  
		 
	// 7. 다음은 % 연산을 수행한 결과값에 10을 더하는 코드입니다. NaN 값을 검사해서 올바른 결과가 
	//	 출력될 수 있도록 (  )에 들어갈 코드를 작성해보세요.
		 
		 
	// double x = 5.0;
	// double y = 0.0;
	// double z = 5 % y;
	//	 if (        Double.isNAN(z)  
	//	) {
	//	 System.out.println("0.0으로 나눌 수 없습니다.");
	//	 } else {
	// double result = z + 10;
    //  System.out.println("결과: " + result);
		 	 
	}

}
