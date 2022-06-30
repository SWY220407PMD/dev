window.onload = () => {

    //Object 객체
    const btn1 = document.getElementById('btn1');

    btn1.addEventListener('click', function(){
        const o1 = {};
        const o2 = {name : "심원용"};
        const o3 = new Object();

        console.log(o1);
        console.log(o2);
        console.log(o3);

        console.log(o1 instanceof Object);
        console.log(o2 instanceof Object);
        console.log(o3 instanceof Object);

        console.log('----------------');

        var result = o1.hasOwnProperty('name');
        console.log(result);

    });//addEventListener

}//onload