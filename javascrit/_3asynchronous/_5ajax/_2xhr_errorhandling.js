// error handling in xhr : 
// jab mera response accha na aaye uske liye mujhe error handle karna hia : 
const url = "https://jsonplaceholder.typicode.com/posts";

// step1 create a object : 
const xhr = new XMLHttpRequest();

// step 2 open 
xhr.open('GET' , url);

xhr.onload = function(){

    if(xhr.status >= 200 && xhr.status < 300 )
    {
    console.log(xhr);
    const response = xhr.response;
    const data = JSON.parse(response);
    console.log(data);
    }
    else{
        console.log("some thing went wrong : ");
    }
}

// ye tab chalega ja internet connection nahi hoga : 
xhr.onerror = function(){
    console.log("netowork error : ");
}

// this is the call back hell xhr ke ander xhr : 
xhr.onload = function(){
    const data = JSON.parse(xhr.response);
    const id = data[8].id;
    const xhr2 = new XMLHttpRequest();
    const url2 = `${url}/${id}`; // create a new url : 
    console.log(url2);

    xhr2.open('GET' , url2);
    console.log(xhr.response);
    xhr2.onload = function(){
        const data2 = JSON.parse(xhr2.response);
        console.log(data2);

        const id = data[2].id;
        const xhr3 = new XMLHttpRequest();
        const url3 = `${url}/${id}`;
        console.log(url3);

        xhr3.open('GET' , url3);
        xhr3.onload = function(){

            const response = xhr.response;
            const data = JSON.parse(response);

            console.log(data);
        }

    }
    xhr2.send();
}

// step 3  
xhr.send();