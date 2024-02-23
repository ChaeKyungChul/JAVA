package sec08;

public class ArrayAddExam {

	public static void main(String[] args) {
		
		String [] members = new String[2];
		String [] membersB = {"¾ÈÃ¶¼ö", "±è¿µÈñ"};

		members[0] = "Ã¶¼ö";
		members[1] = "¿µÈñ";
		
		for(int i=0; i < 2; i++) {
			System.out.println("¸â¹ö ¸í´Ü :" + members[i]);
			System.out.println("¸â¹ö ¸í´Ü :" + membersB[i]);
		}
		
		
//		
//		members[2] = "¼øÀÌ";
//		members[3] = "¹Î¼ö";
//		
//		members[2] = "±è¼øÀÌ";
//		members[3] = "¹Ú¹Î¼ö";
//		
//		for(int i=0; i < 4; i++) {
//			System.out.println("¸â¹ö ¸í´Ü :" + members[i]);
//			System.out.println("¸â¹ö ¸í´Ü :" + membersB[i]);


	}

}
