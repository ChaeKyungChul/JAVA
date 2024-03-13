package sec01;

public class MeasureRuntimeExam {

	public static void main(String[] args) {
		
		
		
		//long ti1 = System.currentTimeMillis();  //초
		long ti1 = System.nanoTime();
		int sum = 0;
		for(int i = 0; i <= 1000000000; i++) {
			sum += i;
		}
		//long ti2 = System.currentTimeMillis();
		long ti2 = System.nanoTime();
		
		System.out.println("1부터 1000000000까지의 합은 " + sum);
		System.out.println("계산에 걸린 시각은 " + (ti2 - ti1) + "나노초 입니다.");
		
		System.out.println(System.getProperties());  //정보다출력
		System.out.println(System.getProperty("os.name")); //os출력
		System.out.println(System.getProperty("user.name")); // 사용자출력
		System.out.println(System.getProperty("user.home")); 
	}

}
