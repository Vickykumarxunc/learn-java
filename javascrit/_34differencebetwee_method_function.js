//? har ek function method nahi hota hai
//? but har ek method function hota hai 

//? function vo hote hai jo hum functin keyword ka use karke banate hai 
//? jab hum function ko object ke ander rakh dete hai to vo method ban jata hai : 

function add(a , b) //? this is a function : 
{
    return a + b;
}

function sub(a , b)
{
    return a - b;
}


//? function ko method banane ke liye ya object me add karne ke liye use ek key deni padti hai :
//? jab hum ek function ko object ke ander rakh dete hai to vo method ban jata hai :  
//? method vo hata hai jisko hum (.)dot lagakr access kar sakte hai : 
const math1 = {
    E : 2.3333333333333,
    add : function add(a , b){
        return a + b;
    },
    sub : function sub(a , b){
        return a - b;
    },
    mul : function mul(a , b){
        return a * b;
    }, 
    div : function div(a , b){
        return a / b;
    },
    sqrt : function squrt(a){
        return a * a;
    }, 
    pi : 3.143567,

    substract(a , b){ // new features oof javascript this is the part of ea6 model 
        return a - b;
    },
    cube(a){
        return a ** 3;
    }

 
}

console.log(math1.add(3 , 4));
console.log(math1.pi);
console.log(math1.div(4 , 2));
console.log(math1.mul(2 , 2));
console.log(math1.E);
console.log(math1.sqrt(3));
console.log(math1.substract(4 , 0));
console.log(math1.cube(3));

 