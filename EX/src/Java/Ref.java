package Java;

public class Ref {

	 int a ; 
	 Ref(int x){
		 a = x;
	 }
	 int sum(Ref obj) {
		 int k;
		 k = obj.a -a;
		 a = 10; obj.a = 20;
		 return k;
	 }
}


