package sec03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		
		//ArrayList �÷��� ����
		List<Board> list = new ArrayList<>();
		
		//��ü�ֱ�
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		list.add(new Board("����6", "����6", "�۾���6"));
		
		//����� �� ��ü �� 
		int size = list.size();
		System.out.println("�� ��ü �� : " + size);
		System.out.println();
		
		//Ȯ�� �ε����� ��ü ��������
		Board bd = list.get(3);
		System.out.println(bd.getSubject()+ "\t" + bd.getContent()+ "\t" + bd.getWriter());
		System.out.println();
		
		//loop�� ���� ��� ��ü ��������
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+ "\t" + b.getContent()+ "\t" + b.getWriter());
			
		}
		System.out.println();
		
		//���� for ������ ��������
		for(Board b : list ) {		
			System.out.println(b.getSubject()+ "\t" + b.getContent()+ "\t" + b.getWriter());
		

	}
	}
}
