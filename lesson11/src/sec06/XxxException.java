package sec06;

public class XxxException extends Exception{
	/*
	 * 기본생성자와 사용자정의 에러 메세지를 받을 생성자를 만든다.
	 */
	
	public XxxException(){}
	public XxxException(String message) {
		super(message);
		
	}
}
