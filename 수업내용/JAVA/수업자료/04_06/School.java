package ���;

class Student_D {
	public void ��Դ�() {
		System.out.println("���˿��� �� �Դ� ��..");
	}
}

class Student_C {
	public void �����ϴ�( ) {
		System.out.println("�ڹ� ���� ��...");
	}
}
class Student_B {
public void �����ϴ�( ) {
		System.out.println("SQL ���� ��..");
				
	}
}
class Student_A {
public void �����ϴ�( ) {
		System.out.println("HTML ������..");
	}
}

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//����			������
		Student_A  HTML = new Student_A();
		HTML.�����ϴ�();
				//����			������
		Student_B  SQL = new Student_B();
		SQL.�����ϴ�();
					//����		������
		Student_C  JAVA = new Student_C();
		JAVA.�����ϴ�();
					//����		������
		Student_D rice = new Student_D();
		rice.��Դ�();

	}

}
