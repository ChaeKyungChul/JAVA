package sec01.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		
		int n = 5;
		
		//arraylist 두개 선언
		ArrayList<Integer> arr1 = new ArrayList<>(n);   //Arraylist 방식
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		//ArrayList<Integer> arr1 = new Vector();
		//ArrayList<Integer> arr2 = new ArrayList<>();    // 벡터방식

		
		//Printing ArrayList
		System.out.println("Array 1 :" + arr1);
		System.out.println("Array 2 :" + arr2);
		
		//입력
		for(int i=1; i<=5; i++) {
			arr1.add(i);
			arr2.add(i);
		}
		System.out.println("Array 1 :" + arr1);
		System.out.println("Array 2 :" + arr2);
		
		//element get
		int e1 = arr1.get(3); 
		System.out.println(e1);
		
	}

}
