package �÷�����;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//������ Ÿ��
		ArrayList<String> list = new ArrayList<String>();	//������	//�Է� �� ctrl + shift + o �ҷ�����
		//<> : ���׸� �ȿ� ������ ������ Ÿ�Կ� ���ؼ� ArrayList�� ���� �����ȴ�.
//		**<> �ȿ��� Ŭ������ �� �� ����.
//		int > Integer
//		String
//		double > Double
//		��� : <> �ȿ��� Ŭ������ �����ϴ�.
		//add : �����͸� list�� ����
		list.add("�ñ�ġ �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		
		int len = list.size(); //list ���� ȣ��
		System.out.println("list ���̴� ===>	" + len);
		
		
		String value = list.get(0); //������ ȣ��
		System.out.println(value);
		
		String val = list.get(1);	//������ ȣ��
		System.out.println(val);
		
//		���� : list�� ����� ��â �Ľ�Ÿ�� �?
		int count = 0; 
	for(int i = 0; i<list.size(); i++) {
		String valued = list.get(i);
		System.out.println(valued);
		if(valued.equals("��â �Ľ�Ÿ")) { //���ڿ��� ����
			++count;
		}
		     
		    }
	System.out.println(count);
	
//			int�� ��� ArrayList
	ArrayList<Integer> list2 = new ArrayList<Integer>(); //() ������
	list2.add(10);
	list2.add(20);
	list2.add(30);
	list2.add(40);
	list2.add(50);
	
//	���� 1. list�� �߰��� ���� ���� ���ϱ�
	
	int cnt = 0;
	for(int i = 0; i<list2.size(); i++) {
		int value2 = list2.get(i);
		System.out.println(value);
		if(list2.get(i) != 50) {
			cnt += list2.get(i);
		}
	}
	System.out.println("�� ���� : " + cnt );
	
//	����
//	list.remove(1); //ù��° �迭 ����
	
	}

}
