//JSON (java script object notaion)
// 변수 이름 (명사 , 복합 명사(카멜 표기법), 데이터 타입 Boolean형 일 떄 변수이름 앞에 is + (명사) Ex : isLogin(로그인 여부) (true) , isMeal (식사 여부))
// key     value로 구성
//  java에서는 JSON을 MAP이라고 함.
var information  = {
  "name" : "lee gyu sung",
  "age" : 40,
 "adress" : "월평북로 11",
"isMarri" : false
}; //JSON : 서버 전송 (key 와 value로 구성)
    // 주의점 
    // 1. key는 중복 불 가능 value 중복 가능
    // 2. value는 정수형(int , double) 문자형 boolean형 배열형(array) null
    // 3. 중괄호로 감싼다.
   
    // 출력
    console.log(information);
    console.log(information.age);

    var age = information.age;

    if(age >= 30) {
        console.log("나이 30대 입니다.")
    }
    if(age >= 20 ) {
        console.log("나이 20대 입니다.")
    }
    if(age >= 10) {
        console.log("나이 10대 입니다.")
    }
    else {
        console.log("조회가 안됩니다.")
    }
    //상수
    const PI = 3.14;
    //배열
    var array = [1,3,4,5,10];
    console.log(array[0]); // 배열 0번째 값 호출
    var len = array.length;// 배열 길이
    const EVEN = 2;
    //짝수 구하기
    for(var i = 0; i<len; i++ ) {
        var value = array[i];
            if(value%EVEN == 0) {
                console.log(value);
            }
        }

        //최댓값 구하기
        var max = 0;
      for(var i=0; i<len; i++) {
          if (max < array[i]) {
              max = array[i];
          }

      }
      console.log ('최댓값은 ==> ' +max);
    

  