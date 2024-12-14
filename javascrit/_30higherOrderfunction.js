
//? higher order function -> jab hum function ko as a argument pass karte hai to hum use kahte hai higher order function 
//? function ke ander se hum ek dusra function ko  return karate hai to us kahte hai higher order function :  

//? this is simple function : 
function a(){
    console.log("hiii");
}
a();

function b(){
    const a = 10;
    const b = 20;
    console.log(a + b);
}
b();

function c(a  , b){
    return a + b;

}

console.log(c(3 , 4));

function d(arr)
{
    let sum = 0;
    for(let i = 0; i<arr.length; i++)
    {
        sum += arr[i];
    }
    console.log(sum);
}
d([1 , 2 , 3 , 4]);

function e(obj)
{
    obj.firstname = "vicky";
    obj.lastname = "kumar";

    console.log(obj);
}
e({firstname : "ronak" , lastname : "rajput"});


//?agar hum function ko function ke trh print karna cahte hai to hum use karte hai console.dir();

function f()
{
    console.log("console.dir()");
}
console.log(f); // ye complete function dega : 
 console.dir(f); // ye as a function dega only f f(); : 

 //? function behind teh scene bhi ek object hota hai aur object ek value hoti hai jisko hum kisi bhi varaible me store kar sakte hai : 
 //? isiliye hum function ko bhi variable me store kar sakte hai jise hum function expression khte hai : 


// 1. Function को argument के रूप में लेना: JavaScript में, आप एक function को दूसरे function में argument के रूप में pass कर सकते हैं। जैसे:
function add(a , b){
    return a + b;
}
function calculate(operation , x , y){
    return operation(x , y);
}

console.log(calculate(add , 5 , 3));

function sub(a  , b)
{
    return a - b;
}
function cal(sub , a , b)
{
    return sub(a , b);
}

const result = cal(sub , 10 , 5);
console.log(result);

// 2.  Function को return करना: JavaScript में functions को return करना भी possible है। उदाहरण:
 function mulitply(x )
 {
    return function(y) // this is anonyms function (without name function)
    {
        return x * y;
    }
 }

 const multiplybytwo = mulitply(2);
 console.log(multiplybytwo(3));


 function power(x)
 {
    return function(y)
    {
        return x ** y;
    }
 }
 const numberPower = power(2);
 const ans = numberPower(5);
 console.log(ans);


 //? anonymus function : 
//  JavaScript में Anonymous Function एक ऐसा function होता है जिसका कोई नाम नहीं होता। ये functions अक्सर उस समय declare किए जाते हैं जब उन्हें एक बार ही use करना होता है, या जब उन्हें किसी और function में pass किया जाता है। Anonymous functions का उपयोग higher-order functions, callbacks, और event handling के लिए किया जाता है।
const add3 = function(a , b)
{
    return a + b;
}
console.log(add3(3 , 4));

//? jis function ko hum as a argument pass karte hai us function ko bolte hai call back funciton : 
 //? aur jis function ke ander pass kiya ja rahi hai use hum bolte hai higher order function : 
 

 //? har annonymous function function expression ho sakta hai : 
 //? lekin har function expression annonymous function nahi hota : 

 const greet = function(){
    console.log("hello");
 }
 greet();

 const pup = function  sayHello(){
    console.log("hello");
 }
 pup();
