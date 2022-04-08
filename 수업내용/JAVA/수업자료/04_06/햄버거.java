package 상속;


 class 햄버거공장 {
	String pattyName;
	int money;
	
	public 햄버거공장(String pattyName , int money) {
		this.pattyName = pattyName;
		this.money = money;
		
	}
//	2
	public 햄버거공장() {
		
	}
	
	

//	1번째 getsetter으로 활용
	public String getPattyName() {
		return pattyName;
	}

	public void setPattyName(String pattyName) {
		this.pattyName = pattyName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}


public class 햄버거 {
	
	public static void main(String[] args) {
		햄버거공장 햄 = new	햄버거공장();
		
		// TODO Auto-generated method stub
		햄버거공장 새우 = new 햄버거공장("방법 2 새우",3000);
		System.out.println(새우.pattyName+"는 "+새우.money+"원");
		
		
//		1번째 방법
		햄버거공장 불고기 = new 햄버거공장("방법2 불고기",2500);
		System.out.println(불고기.pattyName+"는 "+불고기.money+"원");
		
//		3번째 방법
		햄버거공장 불고기 = new 햄버거공장("방법2 불고기",2500);
		System.out.println(불고기.pattyName+"는 "+치즈.money+"원");
	}
	
		
}







