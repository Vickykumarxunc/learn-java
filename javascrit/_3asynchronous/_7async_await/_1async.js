
/* 
? ansync - > 
0. async se promise ko code easy ho jata hai . 
1. async ek keyword hai jisko hum function ke sath use karte hai .
2. function ko promise me convert karne ki liye hum uske liye use karte hai async . 
3.  async function hota hai vo hamesa ek promise return karta hai . 
4. aur us promise ke state fullfilled hoti hai . 
5. aur jo async function return karta hai vo promise result me uski value show hoti hai . 
6. async function ke ander promise by default resolve hi hote hai > ; 

*/
function make_request(){

}
const ans = make_request();
console.log(ans); // it return the undefined : 

// function ko async function banane ke liye async ka use akrte hai . 
 async function make_request1(){

 }

 const ans1  = make_request1();
 console.log(ans1); // state = full filled 
 // result = undefined . 

 async function make_request3() {
    return "hello world";
 }
 const ans3 = make_request3();
 console.log(ans3); // state = full filled 
 // result = jo function value return karege : hello world : 

//? throw keyword : 
/* 
throw key word error create karne ke liye use hota hai . 
? new Error(" se bhi hum error create kar sakte hai : ")

throw keyword ke baad ka jo code hota hai vo run nahi hota hai
function throw keyword ke baad return ho jata hai > 
*/

function create_error(){
     throw("something went wrong : ");
}
// create_error();

function create_error2(){

    console.log("hello world 1 : ");

    throw("404 not found : ");

    console.log("hello world 2 : ");
}
// create_error2();

function create_error3(){
    console.log("hello world 1 : ");

    throw new error("some thing went wrong : ");

    console.log("hello world 2 ");
}
// create_error3();


 //? how to reject the promise in async function : 
 /* 
 1.hum function me return karne ki vajaye error throw kar sakte hai by the throw keyword . 

 */

 async function reject() {
     throw ("Opps! can't open the file : ");
 }

//  reject();

 // how promise work generally : 
 async function make_request4(){

    const url =  'https://jsonplaceholder.typicode.com/todos/1';
     const responsePromise = fetch(url);
     responsePromise.then(
        (response)=>{
            console.log(response);
            return response.json();
        }
     ).then(
        (data)=>{
            console.log(data);
            console.log(data.id);
        }
     )
     console.log(responsePromise);
 }

 make_request4();

 /// promise ka same work ma await keyword se kar sakta hoon : 