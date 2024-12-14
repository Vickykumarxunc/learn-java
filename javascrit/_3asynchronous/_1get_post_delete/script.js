// get post delete method in javascript :::: 
 
//? json -> json javascript ka ek object hota hai : 
//json place holder -> ye hamko free fake api api deta hai object ki form me : 
fetch('https://jsonplaceholder.typicode.com/todos/1')
.then(response => response.json())
.then(json => console.log(json))

// json me key string me form me present hoti hai double quotes ke ander : 
// string bhi double quotes ke ander present hoti hai : 
// hum json ke last me comma nahi rakh sakte  : 
const user = {
    "userid" : 1,
    "id" : 1,
    "title" : "delete us aut autem",
    "completed" : false
}

console.log(user);

//? get method : get request 
// get method se hum kisi be outside wesite se hum data access kar sakte hai : 

//? post method : post request 
// post method se hum ek new post create karte hai : 

//? put request : 
// put request kuch bhi cheej ko modify karne ke liye use hoti hai : 


// example to create a new post : 
fetch('https://jsonplaceholder.typicode.com/posts', {
    method: 'POST',
    body: JSON.stringify({
      title: 'foo',
      body: 'bar',
      userId: 1,
    }),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.json())
    .then((json) => console.log(json));


/*
postman ka use karke hum request bhej sakte hai : 
hum post request bhi bhej sekte hai : 
agar hum keval hrl send karte hai post request ka to vo sirf hame id deta hai 
agar hame ko data bhi dena hai to follow the step : 
1. go body 
2. click raw 
3. choose json 
4. pass the json : 
 */




  