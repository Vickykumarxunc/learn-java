// xhr -> xml http request : 
const url = "https://jsonplaceholder.typicode.com/todos/1";
const xhr = new XMLHttpRequest();
console.log(xhr);

// step 1 ; 
console.log(xhr.readyState); // open karne se phle ready state 0 hoti hia 
xhr.open('GET' , url);
console.log(xhr.readyState); // open karne ke baad ready state 1 ho jati hai ; 

// call multiple state se hokar pass hoti hai :
// onreadystatechange tab chalega jab state change hogi   
xhr.onreadystatechange = function(){
    console.log(xhr);
    console.log(xhr.readyState);

    if(xhr.readyState === 4){
        console.log(xhr.response);
        console.log(typeof xhr.response); // string 
        
        // how to convert string into object : 
        const response = xhr.response;
        const data = JSON.parse(response);
        console.log(typeof data);

    }
 
}

// xhr work with onload 
// onload function tabhi chelega jab ready state 4 ho jayegi : 
xhr.onload = function(){
    console.log(xhr);
    console.log(xhr.response);
    const response = xhr.response;
    const data = JSON.parse(response);
    console.log(data);

}


// step 2 : 
xhr.send();

// response mujhe tab milega jab xhr ki ready state 4 hogi : 
// ready state 3 par loading hoti hai : 
// xhr ka response json ke form me aata hia : 