//? 24/sep/2024 ......

//? variable => a javascript variable is just a name of storage location 
//? and we can give that name in three ways : 
//? 1. using let keyword.
//? 2. using const keyword.
//? 3. using var keyword. 

let username = "vicky";
console.log(username);

let userIntro = "my name is vicky kumar";
console.log(typeof userIntro);

let ishappy = true;
console.log(typeof ishappy);

let firstName = "ronak";
let lastName = "kumar";

console.log(`my first name is ${firstName} and my last name is ${lastName}`);

let resume = "my name is vicky" + "and my age is 18" + "and i am belong to garhi Noabad" + "now i currently live in merrut for study purpose ";
console.log(resume);

let a = undefined;
console.log(typeof a);

let num1 = "vicky";
console.log(num1);
num1 = "kajal";
console.log(num1);

var obj1 = "object";
var obj1 = "object2";
console.log(obj1);

const ourid = 123;
// const ourid2; it give error 

const houseNo = 262;
console.log(typeof houseNo);
 

{
    var hay = "hay world";
}
console.log(hay);

{
    let rupee = 100;
}
// console.log(rupee);

{
    const paise = 500;
}
// console.log(paise);

//? 1. let keyword se hum ek varaible ko ek hi baar declare kar sakte hai.
//?    let ka scope local hota hai within the block we can not access the value outside the block . 
//?    let or const variable ko hum declare karne se phle access nahi kar sakte it give an error. 

//? 2. many string ko hum + operator se concat kar sakte hai. 

//? 3. we can override the value of variable . 

//? 3. var keyword se hum same variable ko many times declare and intialize kar sakte hai . 
//?    var ka scope global hota hai. we can acces the value outside the block . 
//?    var ko hum declare karne se phle bhi use kar sakthe hai but vo hame undefined value dega not a erro: 

//? 4. if we decleare the variable using const keyword then we can not change the value of variable variable treate as constant . 
//?    const variable ko hame immediate declare ke sath sath initialize bhi karna necessary hota hai. 
//?    const ka scope local hota hai (within the block ) we can not acces the value out side the block . 

//? 5. agar hum cahte hai bina variable ko declare kare bina access na kar paye then we use -> "use strict";

