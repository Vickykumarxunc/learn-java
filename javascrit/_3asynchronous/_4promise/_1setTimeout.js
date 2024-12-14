// set time out : 
console.log("set time out ");
function hello(){
    console.log("hello world");
} 
setTimeout(hello , 2000);
console.log("code finish");

setTimeout(()=>{
    console.log("kaishe ho vicky : ");
} , 1000)

// global execution context : 

// settime return me ek id deta hai : 
// jiska use karke hum settimeinterval of delete kar sakte hai : 
let id = setTimeout(() => {
    console.log("delete the set time out ");
}, 2000);

console.log(id); 
clearTimeout(id);
 