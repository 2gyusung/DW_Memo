package ���;


class Account {// ����
	int deposit; //�Ա�
	int withdraw; //���
	int totalMoney; //�ܰ�

//	getter , setter�� �̿���
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) { //�Ա�
		System.out.println("�Ա��� �ݾ��� " + deposit +" �� �Դϴ�.");
		this.deposit += deposit; // �� �Ա� �ݾ�
		this.totalMoney += deposit; //�� �ܾ�
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {	//���
		
		if(this.totalMoney < withdraw) {
			System.out.println("��ü�� �� �����ϴ�");
		}else {
			System.out.println("����� �ݾ��� " + withdraw +" �� �Դϴ�.");
		}
		this.withdraw += withdraw;
		this.totalMoney -=	withdraw; //�� �ܾ�
	
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) { //�ܾ�
		this.totalMoney += interest;
	}

	
	
}



public class Bank { //����
	
//	���ڸ� �ִ� �Լ�
	public static double paidInterestOnAccount(int money) {
		final double INTEREST_RATE = 0.1;
		return money * INTEREST_RATE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(); 
		
		account.setDeposit(1000);
		if(account.getTotalMoney() > 0) {
			System.out.println("���� �ܰ� >>> " + account.getTotalMoney()	+ "��");
		
			account.setWithdraw(500);
			System.out.println("���� �ܰ� >>> " + account.getTotalMoney()	+ "��");
			account.setDeposit(500000);//����
			account.setDeposit(500000);//���ʽ�
			account.setDeposit(500000);//�߱� ����
			System.out.println("���� �ܰ� >>> " + account.getTotalMoney()	+ "��");
			int myMoney = account.getTotalMoney();
			if(myMoney >= 1000000 ) {//�Ա� �� �ܾ��� �鸸�� �̻�
				int interestMoney = (int)paidInterestOnAccount(myMoney);
				System.out.println(("���ڴ� >>> " + interestMoney));
				account.setTotalMoney(( interestMoney));
				System.out.println("���� �ܰ� >> " +account.getTotalMoney() + "��" );
			}
		}
	}

}
