package �׽�Ʈ;

public class ���� {
	   public static void main(String[] args) {
	        String scores = "80, 70, 100, 31";
	        String[] array =  scores.split(","); //	����
	        int len = array.length; //���� ��
	        int sum = 0;
	        //... �ڵ� �ۼ� ...
	        for(int i = 0; i<len; i++) {
	        String temp= array[i].trim();//��,�ڸ� ��������
	        int num = Integer.parseInt(temp); //���ڿ��� ���ڷ� ��ȯ
	        if(num == 100) {
	        	System.out.println("100�� ������ 100��!");
	        }
	        
	        sum += num;
	        
	    }
	        System.out.print("���� : "+scores );
	        System.out.print("��� : "+sum/len); //���� ��
	}
}


		    