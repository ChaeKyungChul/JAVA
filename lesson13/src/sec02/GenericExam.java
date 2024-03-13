package sec02;

public class GenericExam {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.content = "æ»≥Á«œººø‰?";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 1000;
		int num = box2.content;
		System.out.println(num);

	}

}
