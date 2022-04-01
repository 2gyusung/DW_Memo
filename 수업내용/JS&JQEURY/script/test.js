// 1부터 100까지의 더한 값 구하긴
var sum = 0;
for(var i= 1; i<=100; i++) {

    sum += i;
    console.log("1부터 100까지의 더한값은 "+sum + "입니다.");

}

// 1부터 10까지의 짝, 홀 판단
var i = 1;
for(var i = 1; i<=10; i++) {
    if((i%2) == 0) {
        console.log("짝수는" + i);
    }
    if((i%3) == 0) {
        console.log("홀수는" + i);
    }
}

