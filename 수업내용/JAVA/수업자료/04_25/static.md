값이 변하지 않은 아이를 선언
필드변수는 초기값을 자동으로 선언
변하지 않는 값은 대문자로 작성할 것

주로 공통된 객체(클래스)를 여러 개 생성 하여 사용하는 상황에서 많이 사용

싱글톤은 여러차례 호출되더라도 실제로 생성되는 객체(클래스) 하나다.

예제 : 질병 코드 , 진단 코드


인스턴스화 하지 않아도 호출 가능
```java
system.out.println(staticStudy.GAMGI)
```

싱글톤 패턴
코딩 디자인 패턴 중 하나
싱글톤은 스태틱 개념 응용

```java
package 스태틱;
public class MainStatic {
     public static void main(String[] args) {
         Chef c = Chef.getInstance();
         c.printHello();
     }
}

```


```java
package 스태틱;
public class Chef {
    private static Chef chef = null; //스태틱으로 선언된 클래스 변수

    public static Chef getInstance() { //스태틱으로 선언된 메소드
        if(chef == null ) {
            chef = new Chef();
        }
        return chef;
    }
}

 public static Chef getInstance() { 
    system.out.println("hello world");
 }
 }
```

```java
Chef.getInstance(); 인스턴스화가 된 메소드를 스태틱으로 공유
```

```
결론 : static 사용

1. 코드를 정의 할 떄
단, 해당 클래스에는 변수만 존재 1
2. 객체를 여러개 생성해서 사용하는 상황
(데이터베이스 연동할 떄)

```

# 예제문제
```java
package 테스트;

class Dw {
	String className;
	String studentName;
	public Dw() {
		
	}
	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
	
}

public class 긴급점검2 {// 메소드
	
	public static Dw ptintStudent() {
		return  new Dw("스마트웹&웹과정","홍길동");
		 
		
	}
	

	public static void main(String[] args) {
//		방법 1
		Dw d = ptintStudent();
		System.out.println(d.className + " , " +d.studentName);
//		방법 2 
		System.out.println(ptintStudent().className);
		System.out.println(ptintStudent().studentName);
		// TODO Auto-generated method stub

	}

}

```
# 예제문제 2
```javascript 
package test;

import java.util.ArrayList;
import java.util.List;

class Singer{
	public String SingerName; //가수 이름
	
	public Singer(String singerName) {
		this.SingerName = singerName;
		
	}
}


public class 긴급점검 {
	
	public static List<Singer> getListSinger(){
	List<Singer> list = new ArrayList<Singer>();
	list.add(new Singer("김종국"));
	list.add(new Singer("서인국"));
	list.add(new Singer("방용국"));
	return list;
	}
	
	public static Singer getSinger(){
		Singer s = new Singer("김종국");
		return s;
	}
	
	public static void main(String[] args) {
	
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		//2. getSinger()이용해서 김종국만 출력!
	}
}

```

