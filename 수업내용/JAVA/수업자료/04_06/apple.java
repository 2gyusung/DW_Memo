package ���;


public class apple {
	int count;//��� ����
	
	public int getAppleCount(){ 	//���� ��� ����
		return this.count;
	}
	
	public void buyApple(int count){ 	//������ ���
		System.out.println("����� "+count+"�� �����߾��~");
		this.count += count;
	}
	
	public void eatApple(int count){	 //���� ���
		if(this.count >= count){
			System.out.println("����� "+count+"�� �Ծ����~");
			this.count -= count;
		}else{
			System.out.println("ȣ���� ����� �����ؿ�~! "+count+"�� ��ŭ���� �� �����~");
		}
		
	}
}