var name = "홍길동"
var age = 21;

// json
var information = {
    name: '홍길동',
    age: 23
    
};

console.log(information.age);
// json 
//  key : 중복 불가능 value : 값
var dwAcademy = {
    students: ["오승택", "류근환", "강인석", "김보겸","이인서","나정수","정지유","김민영","이규성","이승섭","이상협","홍준호","유영준"],
    students_count: 15,
    teacher: '현상원',
    today: "2022-03-08 ",
    subject : ["SQL" , "JAVA" ,"HTML"]
    
}
console.log(dwAcademy.students_count);

console.log(dwAcademy.students[1]);
// 문제 1
// students_countr가  15 이하면 부족
// students_count가 많으면 정상
var count = dwAcademy.students_count;
if (dwAcademy.students_count <= 13) {
    console.log("학생 수 부족")
}else {
    console.log("학생수 정상")
}


// 문제 2 
// 성 이씨가 몇명인지?
var cnt = 0;
var searchWord  = "이";
 for (var i=0; i<dwAcademy.students.length; i++) {
     var firstName = dwAcademy.students[i].substring(0,1);
     if(firstName == searchWord) {
         ++cnt;
     }
 }
 console.log("이 씨는 총 =>" +cnt);

 var array = [2,5,7,8];
 
 console.log(array[1]);

 var arrayJson = {
     array : [2,5,7,8]
 }
 console.log(arrayJson.array[1]);