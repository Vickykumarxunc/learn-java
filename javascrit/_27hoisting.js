//? hoisting : : : : : : : :
//? variable ko declare karne se phle hi usko accress karne ko hi hoisting kahte hai 
//? var ke case me ye undefined deta hai :  
console.log(username);
var username = "vicky";
console.log(username);

// console.log(a);
// const a = 10;

//? hum let and const ke variable ko agar hum hoist karte hai to vo tdz(temporal dead zone me chale jate hai )
//? jaha se hum variable ko tab tak access nahi kar sakte tab tak use initialize ka kare : 
//? ye hamko error dega : 


hi();
function hi()
{
    console.log("hello world");
}

//? function javascript me hoist ho jate hai 
//? hum function ko function decleration karne se phle bhi call kar sakte hai : 


// sayhi();
//? function expression : 
const sayhi = function(){
    console.log("hii");
}
sayhi();
//? function expression ko hum hoist nahi kar sakte ye hamko error deta hai : 