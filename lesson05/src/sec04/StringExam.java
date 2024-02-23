package sec04;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String name1 = "全辨悼";
			String name2 ="全辨悼";
			
			String name3 = new String("全辨悼");
			 
			System.out.println(name1); // 赛康开 1,2 鞍篮林家
			System.out.println(name2); //赛康开
			System.out.println(name3);  //肯傈货肺 赛康开
			
			System.out.println(name1 == name2);
			System.out.println(name1 == name3);
			System.out.println(name2 == name3);
			
			System.out.println(name1 .equals(name3));
	}

}
