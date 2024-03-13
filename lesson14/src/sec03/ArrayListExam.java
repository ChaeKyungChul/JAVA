package sec03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//객체주기
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		list.add(new Board("제목6", "내용6", "글쓴이6"));
		
		//저장된 총 객체 수 
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		//확정 인덱스의 객체 가져오기
		Board bd = list.get(3);
		System.out.println(bd.getSubject()+ "\t" + bd.getContent()+ "\t" + bd.getWriter());
		System.out.println();
		
		//loop를 돌려 모든 객체 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+ "\t" + b.getContent()+ "\t" + b.getWriter());
			
		}
		System.out.println();
		
		//향상된 for 문으로 가져오기
		for(Board b : list ) {		
			System.out.println(b.getSubject()+ "\t" + b.getContent()+ "\t" + b.getWriter());
		

	}
	}
}
