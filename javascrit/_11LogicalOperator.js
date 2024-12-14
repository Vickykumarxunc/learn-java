//? logical operator : 

//? logical and (&&)
//? logical or (||)
//? logical not (!)

console.log(5 > 4 && 4 > 3);
console.log(5 < 4 && 4 > 3);

console.log(50 > 10  || 5 < 4);
console.log(5 != 5);
console.log(5 != 4);

let age1 = 18;
let age2 = 15;
console.log(age1 && age2);
console.log(age2 && age1);
console.log(age1 || age2);

let x = 0;
let y = 0;
let result = ++x || y++;
console.log(x , y);
//? this is short circut code : 

let a = 0;
let b = 0;
let result1 = ++a && b++;
console.log(a , b);

console.log(0 && 2);
console.log(0 || 2);
console.log(2 || 3);
console.log(2 && 3);

//? and give the rightmost value : if two number are non zero :
//? or give the leftmost value  : if two number are non zero :

 const res = "" && "hello";
 console.log(res);

 const res1 = "" || "hello";
 console.log(res1);

 console.log("hello world" && null);
 console.log("hello world" || null);

console.log("hell" && 8 + 4);
console.log("hello" || 8 + 4);

console.log(undefined || 4 + 8);
console.log("hello" && -4 + 4);

const res2 = "hello" && console.log("vicky");
const res3 = undefined  || console.log("ronak");

const num2 = console.log("hello world");
console.log(num2);

console.log(5 & 7);
console.log(5 | 7);
console.log(10&1);
console.log(11&1);
console.log(!0);
console.log(!1);
console.log(!true);
console.log(!false);
console.log(!!!!"");