package ���;

class StoreSub {
	int money; //�ʵ庯��
//				��ü(�ν��Ͻ�ȭ)�� ���� ~ �������� ����


	
	
	
//	�޼ҵ�
//	�ʵ庯���� �޼ҵ带 Ȱ���ؼ� �����ؾ��Ѵ�.
	public int sumMoney(int money) {
//				  this	>	StoreSub
		int sum = this.money += money;
		return sum;
	}
}



public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ǹ������� �ʵ庯���� �������� �ʴ´�.
		StoreSub s = new StoreSub();
		int result = s.sumMoney(100);
		result = s.sumMoney(100);
		System.out.println(result);
	}

}
