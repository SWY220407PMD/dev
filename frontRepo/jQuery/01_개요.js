// window.onload = function(){
//     console.log("1111");
// }

// window.onload = function(){
//     console.log("2222");
// }

// jQuery(document).ready(function(){

//     console.log("제이쿼리 잘 되는지 ....");

// });

// jQuery(document).ready(function(){

//     console.log("제이쿼리 잘 되는지 ....222222");

// });

$(function(){
    console.log('제이쿼리 잘 되는지...');
    
    console.log($('h3'));
    
    // 각 요소의 배경색 빨강으로 변경
    // const tempArr = $('h3');
    // for(let i = 0; i < tempArr.length; ++i){
    //     tempArr[i].style.backgroundColor = 'red';
    // }
    
    // const arr = document.getElementsByTagName('h3');
    // for(let i in arr){
    //     arr[i].style.backgroundColor = 'red';
    // }
    
    $('h3').css('backgroundColor', 'red');
    
    $('#target').css('backgroundColor', 'blue');
    $('#target').css('width', '100px');
    $('#target').css('height', '100px');
    
    
    
    });