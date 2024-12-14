//? 30/sep/2024 ::::::::::::::::::::::


//? all these code are synchoronus code in javascript it execute the line by line : 
console.log("hi1");

//?for loop bhi hamare aane wale  code ko  some time ke liye dely kar deta hai : 
for(let i = 0;i<1000; i++)
{
    console.log(i);
}

console.log("hi2"); 

function hello()
{
    console.log("helllo");
}

setTimeout(function(){
    console.log("set time out ");
} , 2000)

hello();

//? javascript synchronous code ki har ek line call stack me execute hoti hai : 
//? slow slow dekhne ka liye we use the even loupe : 

//? jo asynchronous code hota hai vo callback queue me store hote hai 
//? event loupe check karta hai ki call stack khali hai ya nahi agar call stack khali hai to asynchrounous code run hota hai : 
//? web apis me synchronous function delay time ke baad callback queue me chale jate hai : 

//? 1. sabse phle asynchronous code web apis me jata hai . fir jab uska delay time complete ho jata hai 
//? 2. to vo call back queue me jata hai . 
//? 3. fir even loupte baar baar check karta hai ki call stack khali hai ya nahi 
//? 4. agar call stack khali hai to asynchronous code one by one call back queue sa nikal kar call stack me chala jata hai : 
//? 5. fir finally execute ho jata hai : 