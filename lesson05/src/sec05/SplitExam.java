package sec05;

public class SplitExam {

	public static void main(String[] args) {
		
		String board = "1, 자바 학습, 참조 타입 String을 공부합니다., 김철수";
		// 쉼표를 기준으로 문자열 분리
		String[] tks = board.split(",");  //[]배열타입
		
		//인덱스로 읽어오기
		System.out.println("번호 : " + tks[0]);
		System.out.println("제목 : " + tks[1]);
		System.out.println("내용 : " + tks[2]);
		System.out.println("이름 : " + tks[3]);
		System.out.println("------------------------------");

		//for문을 이용하여 출력
		for(int i = 0; i < tks.length; i++){
		System.out.println(tks[i]);
		}
	}

}
