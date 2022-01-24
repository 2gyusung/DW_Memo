package study2;

public class 학점계싼기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
		if(score > 90) {
			System.out.println("a");
		}else if (score <= 90 && score > 80) {
			System.out.println("b");
		}else if (score <= 80 && score > 70) {
			System.out.println("c");
		}else {
			System.out.println("f");
		}
	}

}
