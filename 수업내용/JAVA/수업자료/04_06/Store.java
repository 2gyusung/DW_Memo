package 상속;

class StoreSub {
	int money; //필드변수
//				객체(인스턴스화)가 생성 ~ 죽음까지 유지


	
	
	
//	메소드
//	필드변수는 메소드를 활용해서 접근해야한다.
	public int sumMoney(int money) {
//				  this	>	StoreSub
		int sum = this.money += money;
		return sum;
	}
}



public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		실무에서는 필드변수를 접근하지 않는다.
		StoreSub s = new StoreSub();
		int result = s.sumMoney(100);
		result = s.sumMoney(100);
		System.out.println(result);
	}

}
