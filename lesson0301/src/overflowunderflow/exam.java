package overflowunderflow;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		for(int i= 0; i< 5; i++) {
			var1++;
			System.out.println("varl : " + var1);   //오버플러워  127 ㅡ> -128  -127
		}
		System.out.println("-----------------");
		byte var2= -125;
		for(int i = 0; i <5; i++) {
			var2--;
			System.out.println("var2 = " + var2);  //언더 플러워  -126 - 127 - 128  127
		}
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long z1 = (long)x * y;
		System.out.println(z1);
	}

}
