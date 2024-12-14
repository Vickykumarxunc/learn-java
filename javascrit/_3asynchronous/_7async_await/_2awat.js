/* 
await -> await keyword se hum same kaam karwa sakte hai jo promise karta hai :
await keyword promise ke result ko return karta hai :  

await keyword wait karta hai promise ke response aane ka 
jab promise ka aata hai to vo use return kar deta hai . 
varna promise ka response na aane tak aage ka code bhi nahi chalta hai 

async await se asynchronous code synchronously behave karne lagta hai : 
async await se main thread block nahi hota hai program chalta rhta hai . 
await se jo aage ka code vo nahi stop hota hai. vo apana kaam karta rehta hai 
 
await is work for then 
how to handle the data : we use the try and catch : 

await keyword hum async function ke bahar nahi use kar sakte . 
*/
async function make_request1(params) {

    const url = 'https://jsonplaceholder.typicode.com/todos/1';
    const responsePromise = await fetch(url); // ye hame response dega: 
    const data = await responsePromise.json(); // ye hame response ka data dega : 
    console.log(data); // this is a actual data : 
    console.log(responsePromise);
    console.log("hay");

    // fetch the data in one line 
    const data1 = await (await fetch(url)).json();
    console.log(data1);
}
make_request1();

// this is synchronous code it run first : 
function addTwoNumber(){
    return  5 + 6;
}

const ans = addTwoNumber(); 
console.log(ans);


//? synchronous reqest : 
function make_syncRequest(){
   const url =  'https://jsonplaceholder.typicode.com/todos/1';
}