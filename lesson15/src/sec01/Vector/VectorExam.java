package sec01.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		//vector 컬렉션
		//List<Dto> list = new Vector(); ->2천개 초
		List<Dto> list = new ArrayList<>();  //--> 총객채수 1900~2000랜덤으로나옴  멀티스레드로감  중첩이가능함
		
		/*
		Dto dto = new Dto(1, "제목", "내용","홍길동",2);
		System.out.println(dto.toString());
		list.add(dto);
		dto.setNum(2);
		dto.setTitle("2번내용");
		dto.setContent("2번내용");
		dto.setHit(122);
		dto.setWirter("홍길자");
		System.out.println(dto.toString());
		list.add(dto);
		list.add(new Dto(3, "제목3", "내용3", "홍길자", 4));
		list.add(new Dto(4, "제목4", "내용4", "홍길자", 4));
		list.add(new Dto(5, "제목5", "내용5", "홍길자", 5));
		list.add(new Dto(6, "제목6", "내용6", "홍길자", 47));
		list.add(new Dto(7, "제목7", "내용7", "홍길자", 48));
			*/
		
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//객체 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Dto(i, "제목"+i, "내용"+i,"글쓴이"+i, i+4));
					
				}
			}
		};
		
		//작업 스레드 객체 새로 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//객체 추가
				for(int i=1; i<=1000; i++) {
					list.add(new Dto(i, "제목"+i, "내용"+i,"글쓴이"+i, i+4));
					
				}
			}
		};
		
		//thread메소드 실행
		threadA.start();
		threadB.start();
		
		// 작업 스레드 들이 모두 종료될 때까지 메인 스레드를 기다리게 함.
		try {
			threadA.join();
			threadB.join();
		  } catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		//저장된 총 객체수 확인
		int size = list.size();
		System.out.println("총객체 수 :" + size);
		System.out.println();
	}

}
