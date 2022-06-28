//1. 변수와 자료형
//전역변수 선언
str1 = '전역변수';

var str2 = '전역변수'; //함수 밖에 있으면 전역변수

//페이지가 모두 로드되면 자동으로 실행되는 함수 구현
window.onload = function(){

    var str1 = '지역변수';
    var str3 = '지역변수3';
    var str4;

    console.log(str1);          //지역
    console.log(window.str1);   //전역
    console.log(this.str1);     //전역

    console.log('----------------');

    console.log(str2);          //전역
    console.log(window.str2);   //전역
    console.log(this.str2);     //전역

    console.log('----------------');

    console.log(str3);          //지역
    console.log(window.str3);   //언디파인
    console.log(this.str3);     //언디파인

    console.log('----------------');

    console.log(str4);          //언디파인
    console.log(typeof str4);   //언디파인

    console.log('----------중복 선언 테스트----------');

    //var , let , const
    // 1) 중복 선언

    var num = 0;
    console.log(num);

    var num = 10;
    console.log(num);

    var num = 20;
    console.log(num);

    console.log("---------------------------------");

    let numLet = 10;
    console.log(numLet);

    // let numLet = 20;
    // console.log(numLet);

    numLet = 20;
    console.log(numLet);

    console.log("---------------------------------");

    const numConst = 0;
    console.log(numConst);
    
    // const numConst = 0;
    // console.log(numConst);

    // numConst = 10;
    // console.log(numConst);

    // 2) 유효 범위 (스코프)
    // - 함수 안에서 var 키워드로 선언된 변수는 함수 유효 범위를 갖는다.
    // - 함수 안에서 let, const 키워드로 선언된 변수는 블록 유효 범위를 갖는다.

    if(true){
        const temp = 10;
        console.log("if문 안쪽 temp : " + temp);
    }
    console.log("if문 바깥 temp : " + temp);


}