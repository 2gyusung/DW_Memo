package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//데이터 타입
		ArrayList<String> list = new ArrayList<String>();	//생성자	//입력 후 ctrl + shift + o 불러오기
		//<> : 제네릭 안에 지정된 데이터 타입에 의해서 ArrayListㅇ 의해 결정된다.
//		**<> 안에는 클래스만 올 수 있음.
//		int > Integer
//		String
//		double > Double
//		결론 : <> 안에는 클래스만 가능하다.
		//add : 데이터를 list에 삽입
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
		int len = list.size(); //list 길이 호출
		System.out.println("list 길이는 ===>	" + len);
		
		
		String value = list.get(0); //데이터 호출
		System.out.println(value);
		
		String val = list.get(1);	//데이터 호출
		System.out.println(val);
		
//		문제 : list에 저장된 곱창 파스타는 몇개?
		int count = 0; 
	for(int i = 0; i<list.size(); i++) {
		String valued = list.get(i);
		System.out.println(valued);
		if(valued.equals("곱창 파스타")) { //문자열만 가능
			++count;
		}
		     
		    }
	System.out.println(count);
	
//			int를 담는 ArrayList
	ArrayList<Integer> list2 = new ArrayList<Integer>(); //() 생성자
	list2.add(10);
	list2.add(20);
	list2.add(30);
	list2.add(40);
	list2.add(50);
	
//	문제 1. list에 추가된 숫자 총합 구하기
	
	int cnt = 0;
	for(int i = 0; i<list2.size(); i++) {
		int value2 = list2.get(i);
		System.out.println(value);
		if(list2.get(i) != 50) {
			cnt += list2.get(i);
		}
	}
	System.out.println("총 합은 : " + cnt );
	
//	삭제
//	list.remove(1); //첫번째 배열 삭제
	
	}

}
