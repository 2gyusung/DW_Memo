package 테스트;

public class 기초 {
	   public static void main(String[] args) {
	        String scores = "80, 70, 100, 31";
	        String[] array =  scores.split(","); //	제거
	        int len = array.length; //과목 수
	        int sum = 0;
	        //... 코드 작성 ...
	        for(int i = 0; i<len; i++) {
	        String temp= array[i].trim();//앞,뒤만 공백제거
	        int num = Integer.parseInt(temp); //문자에서 숫자로 변환
	        if(num == 100) {
	        	System.out.println("100점 만점에 100점!");
	        }
	        
	        sum += num;
	        
	    }
	        System.out.print("총점 : "+scores );
	        System.out.print("평균 : "+sum/len); //과목 수
	}
}


		    