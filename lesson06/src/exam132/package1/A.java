package exam132.package1;

public class A {
    //필드
	public int field1; // public
	
	int field2; // default
	
	private int field3; // private
	
	public A() {
		  // 클래스 내부에서는 접근제한자의 영향이 없다.
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		method1();
		method2();
		method3();   // 위에다가능
	}	
		//method
		
		public void method1() {}
		void method2() {}
		private void method3() {
				
			}
		
		}
	

