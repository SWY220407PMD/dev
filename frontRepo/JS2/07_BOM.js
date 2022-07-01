console.log(window);

function f01(){
    result = window.open("http://192.168.40.3:5500/new.html", 'naver', 'width=300px', 'height=300px', 'resizable=no');

    setTimeout(function(){
        console.log(result.document);
        result.document.getElementById('v').value = '부모가 보낸 값';
    }, 100);
}

function f02(){
    window.open("https://www.google.com", 'zzz222', 'width=300px', 'height=300px', 'resizable=no');
}

function sendValue(){

}

function sayHello(){
    window.setTimeout(function(){
        console.log("hello");
    },2000);
}

function sayBye(){
    window.setInterval(function(){
        console.log("bye");
    }, 2000);
}


function locationTest(){
    //객체의 모든 프로퍼티 출력
    for(var k in location){
        console.log(`${k} : ${location[k]}`);
    }
}