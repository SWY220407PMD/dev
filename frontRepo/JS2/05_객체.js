window.onload = () => {
    const btn1 = document.getElementById('btn1');

    btn1.addEventListener('click', function(){
        let product = {
            pName : '갤럭시 퀀텀',
            price : 100000,
            brand : '삼성',
            'max~battery~time!!!' : 12,
            nums : [10, 20, 30, 'one', 'two', 'three'],
            obj : {
                a : 'apple',
                b : 'banana',
                c : 'chocolate'
            },
            f01 : ()=>{console.log("현재 객체의 pName : " + product.pName); return 777;}
        };

        console.log(product);

        console.log(product.pName);
        console.log(product.price);
        console.log(product.brand);
        console.log(product["max~battery~time!!!"]);
        console.log(product.nums);
        console.log(product.obj);
        console.log(product.nums[4]);//two
        console.log(product.obj.c);//chocolate
        console.log(product.f01);
        console.log(product.f01());

        // let x = 'pName';
        // console.log(product[x]);
        // console.log(product['price']);
        // console.log(product['brand']);

    }); //addEventListener end

    //객체와 반복문
    const btn2 = document.getElementById('btn2');

    btn2.addEventListener('click', function(){
        const game = {
            title : '메이플스토리',
            price : '100',
            os : ['window', 'mac', 'linux']
        };

        console.log(game);

        for(let key in game){
            console.log(`key:${key} , value:${game[key]}`);
        }

    });//addEventListener


    const btn3 = document.getElementById('btn3');


    btn3.addEventListener('click', function(){
        const student = {};

        student.name = "심원용";
        student.age = 20;
        student['height'] = 183.7;
        student.introduce = function(){
            console.log("name : " + this.name);
            console.log("age : " + this.age);
            console.log("height : " + this.height);
        }

        console.log(student);
        student.introduce();
        console.log('height' in student);
        console.log('weight' in student);

        delete(student.height);

        console.log('height' in student);
        console.log('weight' in student);

        console.log(student);
        console.log(student.height);

    });//addEventListener


    //객체 배열
    const btn4 = document.getElementById('btn4');

    btn4.addEventListener('click', function(){

        //배열을 사용하지 않고
        //const user01 = {name:'심원용', height:183.7 , weight:88.8};

        const userArr = [
            {name:'심원용', height:183.7 , weight:88.8},
            {name:'심투용', height:183.7 , weight:88.8}
        ];

        userArr.push({name:'심삼용', height:183.7 , weight:88.8});
        const tempUser = {name:'심사용', height:183.7 , weight:88.8};
        userArr.push(tempUser);

        console.log(userArr);


    });//addEventListener


    //생성자 함수
    function Person(name, height, weigh){
        //속성
        this.name = name;
        this.height = height;
        this.weigh = weigh;
        //this.thisVar = "디스의 변수에 넣은 값";
        //var normalVar = '일반 변수에 넣은 값';
        // this.getName = function(){
        //     return this.name;
        // }
    }

    Person.prototype.kh = '안녕';
    Person.prototype.getName = function(){
        return this.name;
    }


    const btn5 = document.getElementById('btn5');

    btn5.addEventListener('click', function(){

        result = new Person('심원용',183,88);
        console.log(result);
        console.log(result.getName());

    });












}//onload