package sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class PrintAnoExam {

	public static void main(String[] args) {
		
		Method[] delclareMethods = Serveice.class.getDeclaredMethods();
		for(Method method : delclareMethods) {
			// PrintAno 얻기
			PrintAno pAno = method.getAnnotation(PrintAno.class);
			
			//실행 정보를 이용해서 선 출력
			printLine(pAno);
			try {
				method.invoke(new Serveice());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printLine(pAno);
		}

	}

	private static void printLine(PrintAno pAno) {
		if(pAno != null) {
			//number 속성얻기
			int number = pAno.number();
			for(int i = 0; i < number; i++) {
				//value 속성얻기
				String value = pAno.value();
				System.out.print(value);
				
			}
			System.out.println();
		}
		
		
	}

}
