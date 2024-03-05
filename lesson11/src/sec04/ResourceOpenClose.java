package sec04;

public class ResourceOpenClose implements AutoCloseable{
   
	 //필드 
	private String name;
	
	//새성자
	public ResourceOpenClose(String name) {
		this.name = name;
		System.out.println(name + " 열기");
	}
	
	public String read1() {
		System.out.println(name + "읽기");
		return "100";
	}
	public String read2() {
		System.out.println(name + "읽기");
		return "홍길동";
	}
	
	
	
	@Override
	public void close() throws Exception {
		System.out.println(name + "닫기");
	}
	
}
