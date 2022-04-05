package 상속;

class Student_C {
	public void 공부하다( ) {
		System.out.println("자바 공부 중...");
	}
}
class Student_B {
public void 공부하다( ) {
		System.out.println("SQL 공부 중..");
				
	}
}
class Student_A {
public void 공부하다( ) {
		System.out.println("HTML 공부중..");
	}
}

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_A  HTML = new Student_A();
		HTML.공부하다();
		
		Student_B  SQL = new Student_B();
		SQL.공부하다();
		
		Student_C  JAVA = new Student_C();
		JAVA.공부하다();

	}

}
