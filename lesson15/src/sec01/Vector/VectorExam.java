package sec01.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		//vector �÷���
		//List<Dto> list = new Vector(); ->2õ�� ��
		List<Dto> list = new ArrayList<>();  //--> �Ѱ�ä�� 1900~2000�������γ���  ��Ƽ������ΰ�  ��ø�̰�����
		
		/*
		Dto dto = new Dto(1, "����", "����","ȫ�浿",2);
		System.out.println(dto.toString());
		list.add(dto);
		dto.setNum(2);
		dto.setTitle("2������");
		dto.setContent("2������");
		dto.setHit(122);
		dto.setWirter("ȫ����");
		System.out.println(dto.toString());
		list.add(dto);
		list.add(new Dto(3, "����3", "����3", "ȫ����", 4));
		list.add(new Dto(4, "����4", "����4", "ȫ����", 4));
		list.add(new Dto(5, "����5", "����5", "ȫ����", 5));
		list.add(new Dto(6, "����6", "����6", "ȫ����", 47));
		list.add(new Dto(7, "����7", "����7", "ȫ����", 48));
			*/
		
		
		//�۾� ������ ��ü ����
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//��ü �߰�
				for(int i=1; i<=1000; i++) {
					list.add(new Dto(i, "����"+i, "����"+i,"�۾���"+i, i+4));
					
				}
			}
		};
		
		//�۾� ������ ��ü ���� ����
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//��ü �߰�
				for(int i=1; i<=1000; i++) {
					list.add(new Dto(i, "����"+i, "����"+i,"�۾���"+i, i+4));
					
				}
			}
		};
		
		//thread�޼ҵ� ����
		threadA.start();
		threadB.start();
		
		// �۾� ������ ���� ��� ����� ������ ���� �����带 ��ٸ��� ��.
		try {
			threadA.join();
			threadB.join();
		  } catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		//����� �� ��ü�� Ȯ��
		int size = list.size();
		System.out.println("�Ѱ�ü �� :" + size);
		System.out.println();
	}

}
