//? scope  //? 29/sep/2024 

const username = "vicky"; // script scope 
let age = 25; // script scope 
var a = 15; // window object
console.log(window.a);


function add(){
    const x = 5;
    const y = 8;
    console.log( x + y);
    console.log(username);

}
 
add();

//? function ke variable ka scope only function  ke ander tak hi simit hota hai
//? hum function ke variable ko function ke ander hi access kar sakte hai : 
//? outsife function ke variable ko hum function ke ander access kar sakte hai : 
// console.log(x);

//? jab hum let or const ka use karke variable ko banate hai to ve script scope me jayega : 
//? jab hum var ka use karke variable ko declare karte hai to vo window scope me jate hai : 
//? function decleration bhi window object ke ander hi jate hai : 
//? window object ka ander jitni bhi ceeje hoti hai use hum window.() karke access kar sakte hai 
//? script object me hum aisha nahi karte hai : 
console.log(window.a);
console.log(window.age); // undefined 

//? jo variable function ke ander declare hote hai uska scope local hota hai within the block : 
//? jo variable function ke bahar declare hote hai uska schope global hota hai function scope : 



const num1 = "vicky"; // global scope 
function sub(a , b)
{
    const num1 = "vicky"; // local scope : 
    console.log(num1);
    console.log(a + b);
}
sub( 2 , 4 );