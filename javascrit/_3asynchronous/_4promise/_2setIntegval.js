
// set interval har ek ke badd ya har ek time period ke baad run hota hia 
// jab ki set time out function only ek baar hi run hota hai : 
console.log("set interva");

console.log("script start : ");
setInterval(()=>{
    console.log("hello world : ");
    console.log(Math.floor(Math.random() * 10));
} , 1000);
console.log("script end ");