// promise : promise is a future value
// promise represent the future value : 
// promise ka kuch status or value hoti hai : 
// starting me status pending hoti hai ; 
// starting me value undefined hoti hai : 

// agar given condition satisfied ho jati hai to promise ka status full fill ho jati hai 
// agar given condition satisfied nahi hoti to promise reject ho jayega : 
// value undefind se change hokar kuch ho jayegi : 
/*
promise ek aishe value hai jo hame abhi nahi pata par future me pata hogi : 
promise is a asynchronous task  : 

 */
console.log("script start : ");
// fried rice example : 
const bucket = ["coffee" , "chips" , "vegetable" , "salt" , "rice"];

// how to create promise : 
const fried_rice_promise = new Promise((resolve , reject) =>{

    // if condition is satisfied then resolve function is execute : 
    if(bucket.includes("vegetable") && bucket.includes("salt") && bucket.includes("rice")){

        // hamara promise resolve ho jayega : 
        // resolve function ke ander hum kuch bhi value pass kar sakte hai : 
        resolve("fried rice is cooked : ");

    }
    // if condition is not satisfied then promise is reject : 
    else{
        reject("couldn't do it ");

    }
})

// how to consume promise : 

/* 
then method as a parameter ek call back function lega ; 
aur is call back function ke ander vo value aa jayegi jo promise resolve hone ke baad aayegi :

then ke ander hum kitne bhi function pass kar sakte hai : 
hum then method ke ander do fucntion pass karege 

first function promise resolve ke liye run hoga 
second function promise reject ke liye run hoga 
*/

fried_rice_promise.then(

    // jab promise resolve hoga : 
    (resolve)=>{
        console.log("let's eat " , resolve);
    }, 
    // jab promise reject hoga : 
    (reject)=>{
        console.log(reject);
    }
)

// hum chaining kake error ko bhi handle kar sakte hia : by using catch 
fried_rice_promise.then(

    // jab promise resolve hoga : 
    (resolve)=>{
        console.log("let's eat" , resolve);
    }

    // jabr promise reject hoga : 
).catch(
    (error)=>{
        console.log(error);
    }
)

// set time out promise ke baad execute hoga : 
setTimeout(()=>{
    console.log("set time out : ");
} , 2000)

for(let i = 0; i<100; i++){
    console.log(Math.random()*100);
}

console.log("script end : ");

// memory of the promise : 
// promise consume by the browser : 
// promise add hote hai microtask queue me : 
// microtask queue ki priority call back queue se jyada hoti hai 
// microtask queue wala code call back queue wale code se phle execute hoga : 
