package exam14;

public class MemberExam {

	public static void main(String[] args) {
		Member mem = new Member();
		
		mem.setNum(1);
		mem.setUserName("ghdrlfehd@naver.com");
		mem.setUserEmail("홍길동");
		mem.setGender(false);
		mem.setCount(1000);
		mem.setAddress("김포시");
		mem.setAge(21);
		
		System.out.println(mem.getNum());
		System.out.println(mem.getUserName());
		System.out.println(mem.getUserEmail());
		String g ;
		
		if(mem.isGender()) {	
			g= "여자" ;
		}else {
			g = "남자";
		}
		System.out.println(g);
		System.out.println(mem.getCount());
		System.out.println(mem.getAddress());
		System.out.println(mem.getAge());
	}

}
