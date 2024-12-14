
function add(a , b)
{
    return a + b;
}

function calc(add , a , b)
{
    return add(a , b); //? this is closure : 
}

const ans = calc(add , 4 , 5);
console.log(ans);

 function pow(x , y)
 {
    return function()
    {
        return x ** y;
    }
 }

 const num1 = pow(2 , 3);
 num2 = num1();
 console.log(num2);


function reminder(num1)
{
    return function()
    {
        return num1 % 10;
    }
}

const rem1 = reminder(7 , 3);
rem2 = rem1();
console.log(rem2);


function sub(a , b)
{
    function sub1()
    {
        return a - b;
    }
    return sub1;
}
 
const sub1 = sub(4 , 2);
const sub2 = sub1();
console.log(sub2);


//? jab inner function outer function ke variable ko use karta hai aur outer function jab inner function ko return karta hai to inner function ke sath sath outer function ke variable
//? bhi return ho jate hai isi ko hum closure  kahte hai 
//? inner function outer function ke varaible ko closure bana leta hai : 

function outer(){
    const a = 4;
    function parent(){ //? parent ke closure me {a : 4} hai 
        const b = 6;
        function add(){ //? add ke closure me {b : 6 a : 4} hai : 
            return a + b;
        }
        return add();
    }
    return parent();
}

const res1 = outer();
console.log(res1);