package ���;


 class �ܹ��Ű��� {
	String pattyName;
	int money;
	
	public �ܹ��Ű���(String pattyName , int money) {
		this.pattyName = pattyName;
		this.money = money;
		
	}
//	2
	public �ܹ��Ű���() {
		
	}
	
	

//	1��° getsetter���� Ȱ��
	public String getPattyName() {
		return pattyName;
	}

	public void setPattyName(String pattyName) {
		this.pattyName = pattyName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}


public class �ܹ��� {
	
	public static void main(String[] args) {
		�ܹ��Ű��� �� = new	�ܹ��Ű���();
		
		// TODO Auto-generated method stub
		�ܹ��Ű��� ���� = new �ܹ��Ű���("��� 2 ����",3000);
		System.out.println(����.pattyName+"�� "+����.money+"��");
		
		
//		1��° ���
		�ܹ��Ű��� �Ұ�� = new �ܹ��Ű���("���2 �Ұ��",2500);
		System.out.println(�Ұ��.pattyName+"�� "+�Ұ��.money+"��");
		
//		3��° ���
		�ܹ��Ű��� �Ұ�� = new �ܹ��Ű���("���2 �Ұ��",2500);
		System.out.println(�Ұ��.pattyName+"�� "+ġ��.money+"��");
	}
	
		
}







