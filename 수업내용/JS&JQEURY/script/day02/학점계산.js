// 학점 계산 (90점 초과 A, 80점 초과 B, 70점 초과 C, 70점 이하는 F)


var school = 70;

if(school > 90) {
    console.log('이번 학기 학점은 A 입니다.')

}else if (school <= 90 && school > 80) {
    console.log('이번 학기 학점은 B 입니다.')
}else if (school <= 80 && school > 70) {
    console.log('이번 학기 학점은 C 입니다.')

}else if (school <=70 && school > 60  ) {
    console.log('이번 학기 학점은 D 입니다.')
}else {
    console.log('내년에 다시 보아요')
}

var score = 88;

if(score > 90) {
    console.log('이번 학기 학점은 A 입니다.')
}else if  (score <=90 && score > 80) {
    console.log('이번 학기 학점은 B 입니다.')
}else if (score <=80 && score > 70) {
    console.log('이번 학기 학점은 C 입니다.')
}