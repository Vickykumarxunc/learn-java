//? setTimeout() -> ek function hai jo hame browser provide karta hai : na ki javascript 
//?                 setTimeOUt function me ek at least ek argument required hota hai : 
//?                 it is a higher order function : 

//? jo function ke ander likha hua hai settimeout use javascript code ke trh treat karta hai our backend me ek file create karta hai
  setTimeout('console.log(true)')

  //SetTimeout string ko javascript code me convert kar deta hai : 
// setTimeout("hiii");

setTimeout('console.log("vicky")');

//? setTimeout do cheeje leta hai first is code second is time kitne time baad hame apane code ko execute karana hai
//? setTimeout funtion ka code tab execute hota hai jab javascript ka code completely run ho jata hai : 

setTimeout(() => {
    console.log("ye code 2 second baad run hoga : ");
    
}, 2000);

//? sabse phle javascript ka code execute hoga 
//? sabse baad settimeout function ka code execute hoga  : 
const a = "vicky";
console.log(a);
console.log(a);

setTimeout(() => {
    console.log("ye code 4sec bad execute hoga : ");
}, 4000);


//? setTimeout function hamke return value bhi deta hai: 
//? hum return value ko store bhi kar sakte hai 

const return_value = setTimeout(() => {
    console.log("setTimeout function kuch value return bhi karta hai : ");
}, 3000);

console.log(`return value of setTimeout function is = ${return_value}`);

//? setTimeout function ke jo return value hoti hai vo timer ki id hoti hai : 
//? har ek timer ki alag alag value hoti hai : 
//? hum id ka use karke settimeout ko clear kar sakte hai using the clearTimeout(id of timer) : 

setTimeout(() => {
    console.log("object1");
    
}, 1000);
setTimeout(() => {
    console.log("object2");
    
}, 20000);
const object3_id = setTimeout(() => {
    console.log("object3");
    
}, 30000);

clearTimeout(object3_id); //? ab object 3 print nahi hoga kyoki hamne uski id ko use karke use clear kar diya hai : 
  

function fun(){
    console.log('hello world');
}


//? isme sabse phle fun() function execute hoga : fir uski jgh undefined hojayega aur 3sec baad kuch bhi print nahi hoga : 
setTimeout(fun() , 2000);

//? isiliye jab hum settimeout me function pass karte hai to sirf function ka naam dete hai uske aage parentthesis nahi lagate (): varna vo ek time ke baad kubh bhi print nahi karega : 
setTimeout(fun , 60000);

//? no effect 
setTimeout( undefined , 2000); 
setTimeout(null , 1000);
setTimeout(true , 3000);

//? except function code and timer jo bhi cheeh hum setTimeout function me dete hai to vo argument me store hoti  hai as a array type : 
//? hum argument ki value ko access bhi kar sakte hai : koi se bhi index ki : 
function fun1(){
    console.log(arguments);
    console.log(arguments[3]);
    console.log(arguments[2]);
    console.log("this is an argument : ");

}
setTimeout(fun1 , 2000 , "vicky" , "ronak" , 1 , 2 , 3 , ['apple' , 'papaya']);
 
//? agar setTimeout me time na de to by default vo zero time le leta hai 
//? aur ye baak ke settime function se phle execute hoga :


//? jo javascript ka code hota hai vo synchronous hota hai means -> hamara code line by line execute hota hai : 
//? par setTimeOut function asynchronous hota hai ye turnat run nahi karta phle ye call back  queue me store hota hai 
//? aur ek even loop hota hai jo bar bar call stack ke check karta hai ki completely javascript code execute hogaya hai nahi :
//? agar call stack completely empty ho gaya hai tab event looop asynchoronus code ko delay time ke baad run karne ki permision deta hai : 

//? setInterval() -> setInterval function code ko ek particulr delay time ke baad infinite time execute karata hai  : 
//? isko rokne ke liye hame is clear karna hoga by using the clearInterva(id) : 
//? setInterval() bhi hame id return karke deta hai : 

const interval = setInterval('console.log("hello world ")' , 1000);
clearInterval(interval);