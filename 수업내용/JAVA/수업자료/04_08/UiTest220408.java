package �׽�Ʈ;

class User{
	//�ʵ庯��
	String username;
	String userpassword;
	String userrePassword;
	boolean isLogin;
	//������
	public User(String userId, String password, String rePassword, boolean isLogin){
		this.username = username;
		this.userpassword = userpassword;
		this.userrePassword = userrePassword;
		this.isLogin = isLogin;
	}
}


// test ��Ű�� ���� ��  UiTest220408 Ŭ���� ������ ��!
public class UiTest220408 {
	
	public static void main(String[] args) {
		String username = "�̱Լ�";
		String password = "1234";
		String rePassword = "1234";
		boolean isLogin = false;
		//1.userId�� ���̵� ������ ���� (���̵�� 20���� ����)
		if(username.length() >= 20) {
			System.out.println("20���� ���Ϸ� �Է����ּ���");
		}
		//2.��й�ȣ�� ���й�ȣ ������ ���� (��й�ȣ ���ڴ� 15���� ����)
		if(password.length() <=15 && rePassword.length() <=15) {
			if(password.equals(rePassword)) {
				isLogin = true;
			}
			if(isLogin) {
				User user = new User(username,password,rePassword,isLogin);
				System.out.println(username);
				System.out.println(password);
				
			}
		}
		//3.��й�ȣ�� ���й�ȣ ��ġ �ϸ� isLogin�� true ����
		//4.1~3�� �����ϸ� UserŬ���� ȣ��, ������ �Ķ���Ϳ� �� ����.
	}
}
