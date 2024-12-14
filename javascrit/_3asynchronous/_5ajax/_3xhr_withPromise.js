// xhr with promise : 
 const url = "https://jsonplaceholder.typicode.com/posts";

function sendRequest(method , url){

    return new Promise((resolve , reject)=>{

        const xhr = new XMLHttpRequest();

        xhr.open('GET' , url);

        xhr.onload= function(){
            const response = xhr.response;
            const data = JSON.parse(response);

            if(xhr.status >= 200 && xhr.status < 300){
                resolve(response);
            }
            else{
                reject(new Error("something went wrong : "));
            }
        }
        xhr.onerror = function(){
            reject(new Error("something went wrong : "));
            
        }
        xhr.send();
    })
}

// consume promise 
// then bhi  ek promise return karta hia  
 sendRequest('GET' , url)
   .then(
    (response)=>{
        const data = JSON.parse(response);
        console.log(data);
        return data;
    }
   ).then(
    (data)=>{
        console.log(data);
        const id = data[3].id;
        console.log(id);

        return id;
         
    }
   ).then(
    (id)=>{
        console.log(id);
         const url1 = `${url}/${id}`;
         return sendRequest('GET' , url1);
    }
   )
   .then(
    (newResponse)=>{
        console.log(newResponse);
        const new_data = JSON.parse(newResponse);
        console.log(new_data);
    }
   )
   .catch(
    (error)=>{
        console.log(error);
    }
   )