package �÷�����;

import java.util.ArrayList;

class Student { //�ʵ庯��
	String name;
	int age;
	String addr; //��� ��

	public Student() {//�⺻ ������(�ۼ� �ؾ� ���� �� ��)
		
	}

	
	public Student(String name, int age, String addr) {
//	Student == this
	this.name = name;
	this.age = age;
	this.addr =addr;

}
	public int getAge() {//�޼ҵ� �Լ� 
		return this.age;
	}
	
	public void setAge(int age) { //���� ����
		this.age = age;
	}
	
}

public class ArrayList_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("ȫ�浿" , 26 , "�λ�");
		System.out.println(s1.name); //�Ҹ� �� ������ �� ����
		System.out.println(s1.age);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);//Student Ŭ���� �߰�!
		String name = list.get(0).name; //Student Ŭ���� �ҷ���![�̸����] �ʵ庯��
		System.out.println(name);
		
		String addr = list.get(0).addr; //[�ּ����]
		System.out.println(addr);
		
		int age = list.get(0).getAge(); //�޼ҵ�(�Լ�) �ҷ���
		
//	**	���� ����
		list.get(0).setAge(33);
		age = list.get(0).getAge();
		System.out.println(age);
		
		
	}

}
