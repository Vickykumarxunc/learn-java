/* 
in javascript try catch is used to handle exceptions  or error . 
that may occur during the execution of a block of the code . 
it allow you to test a block of code for error and if an error occurs , 
the catch block will handle it without terminating the script > 
*/

//? syntax : 
try{
    // code that may throw an error : 
    // try block ke ander vo code hoga jo error throw kar sakta hai . 
}catch{
    // code to handle the error : 
    // catch ke ander vo code hoga jo error ko handle kar sakta hai . 
}finally{
    // code that will run regardless of succss or failure : 
    // finally ke ander vo code hoga jo bina error ke run ho sakta hai : 
}


//? try ->
// contains the block of code that you want to test for error : 

//? catch -> 
/*
contain the block of code that will execute if an error in the try block . 
the error object is often passed as an argument to catch (commonly named error or e) 
which can give you more details about the error . 
*/

//? finally -> 
/* 
(optional) this block always execute regardless of whether an error was thrown or not . 
its often used for cleanup code like closing files releasing resources or resetting state . 
*/

//? lets take example >L. 
try{
    let result = 10/0;
    console.log(result);
}catch(error){
    console.log("an error occupied : " , error.message);
}finally{
    console.log("this will run no matter what : ");
}

try{
    // this code will give the error so it place inside the try block : 
    console.log(a); 
}catch(error){ // is error parameter se hum dekh sakte hai ki kis type ka error hai : 
    console.log("something went wrong = " , error); // it will run because is not defind : 
    console.dir(typeof error);
    console.dir(error)
}finally{
    console.log("run smoothly : ");
}

/// this error is an object : 
// to see the as object form we use the console.dir(error)

const user = {
    name : "vicky",
    age : 18
}
try{
console.log(user.address); // it will give the undefined : 
console.log(user.address.city); // it will give an type error : we can not access the property of undefined :  
}catch(error){
    console.log(error.message);
}finally{
    console.log("hello world : "); // finally block har ek case me run hoga : 
}

//? use try catch in async await : 
const url = 'https://jsonplaceholder.typicode.com/todos/1';

async function make_request(){
    try
    {
    const url = 'https://jsonplaceholder.typicode.com/todos/1';
    const response = await fetch(url); // give the response 
    const data = await response.json();
    console.log(data);
    console.log(response);
    }
    catch(error){
        console.log("something went wrong = " , error);
    }
}
 make_request();

