package 컬렉션즈;

import java.util.ArrayList;

class Student { //필드변수
	String name;
	int age;
	String addr; //사는 곳

	public Student() {//기본 생성자(작성 해야 오류 안 남)
		
	}

	
	public Student(String name, int age, String addr) {
//	Student == this
	this.name = name;
	this.age = age;
	this.addr =addr;

}
	public int getAge() {//메소드 함수 
		return this.age;
	}
	
	public void setAge(int age) { //나이 변경
		this.age = age;
	}
	
}

public class ArrayList_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동" , 26 , "부산");
		System.out.println(s1.name); //소멸 될 때까지 값 유지
		System.out.println(s1.age);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);//Student 클래스 추가!
		String name = list.get(0).name; //Student 클래스 불러옴![이름출력] 필드변수
		System.out.println(name);
		
		String addr = list.get(0).addr; //[주소출력]
		System.out.println(addr);
		
		int age = list.get(0).getAge(); //메소드(함수) 불러옴
		
//	**	나이 변경
		list.get(0).setAge(33);
		age = list.get(0).getAge();
		System.out.println(age);
		
		
	}

}
