package ���;


public class Person {

	public static void main(String[] args) {	
        
		apple apple = new apple();

		System.out.println("���� ����� : "+apple.getAppleCount()+"�� �ֽ��ϴ�.");
		apple.buyApple(20);
		if(apple.getAppleCount() > 0){
			System.out.println("���� ����� : "+apple.getAppleCount()+"�� �ֽ��ϴ�.");
			apple.eatApple(30);
			System.out.println("���� ����� : "+apple.getAppleCount()+"�� �ֽ��ϴ�.");
			apple.buyApple(20);
			System.out.println("���� ����� : "+apple.getAppleCount()+"�� �ֽ��ϴ�.");
			apple.eatApple(30);
			System.out.println("���� ����� : "+apple.getAppleCount()+"�� �ֽ��ϴ�.");
		}
		
	}
}
