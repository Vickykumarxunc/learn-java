//? comparison operator : 

//? == equal to (equality)
//? === equal value and equal type (strict equality)
//? != not equal
//? !== not equal or not equal type(strict)
//? > greater than 
//? < less than 
//? >= greater than or equal to 
//? <= less than or equal to 


let a = 10;
let b = 20;
let result = a == b;
console.log(result);

let a1 = 10;
let b1 = '10';
console.log(a1 == b1);
console.log(a1 === b1);

let c = 20;
let d = 30;
let e = 20;
console.log(c > d);
console.log(c >= e );

let f = 10;
let g = "10";
console.log(f != g); // false 
console.log(f !== g); // true 

console.log(21 > 22);
console.log(21 < 24);
console.log(21 > '19');
console.log(21 <= '30');
console.log('90' >= 90);