

/* 
one way to use the await out side the async function  : 
use type = "module" in the javascript : : 
*/

const url = 'https://jsonplaceholder.typicode.com/todos/1';

const response = await fetch(url);
console.log(response); // give the response of the promise  : 

const data =  await response.json(); // it give the data of response in the form of the object : 
console.log(data);
console.log(data.id);


