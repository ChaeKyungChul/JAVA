package sec11;

public class Korean {

   //�ν��Ͻ� final �ʵ�
	final String nation = "���ѹα�";
	final String ssn ;
	
	String name;
	
	//������ ����
	public Korean(String ssn) {
		this.ssn = ssn;
		
	}
	
	void KoreanInit(String getSsn, String getName ) {
		this.name = getName;
		System.out.println(this.ssn +"-"+ this.name );
	}
}
