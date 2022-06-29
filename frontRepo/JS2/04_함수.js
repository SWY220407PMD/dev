function test1(){
    alert('test1 called...');
}

const btn1 = document.getElementById('btn1');

btn1.addEventListener('click', function(){
    alert('익명함수 실행됨...');
});



//자동 실행 함수
// (
// function(){
//     alert('자동실행 함수 호출됨 ....');
// }()
// );

//arrow function test
var arrowFunc = a => {
    var result = a * 10;
    return result;
}

//console.log(arrowFunc(7));



const btn2 = document.getElementById('btn2');

btn2.addEventListener('click', function(){
    console.log('가변 인자 테스트 버튼 클릭됨 ...');
    sum(10, 20, 30, 1, 2, 3);
})

function sum(){
    var result = 0;
    for(let i = 0 ; i < arguments.length; ++i){
        result += arguments[i];
    }
    console.log(result);
}


const btn3 = document.getElementById('btn3');

btn3.addEventListener('click', function(){
    var result = getAnonymousFunc();
    console.log(result);
    result();
});

function getAnonymousFunc(){
    var count = 3;
    return function(){
        alert(count);
    }
}


