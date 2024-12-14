// fetch 
// fetch se hum less number of line me url par request send kar sakte hai : 
const url = "https://jsonplaceholder.typicode.com/posts";

// fetch by default get request karta hai 
// ye ek inbuild function hota hai :
// fetch promise return karta hai ; 
const return_value = fetch(url);
console.log(return_value);
console.log(typeof return_value);


fetch(url)
  .then(
    (response)=>{
        console.log(response); // ye hamko json ke form me data nahi dega : 
    }                        // uske liye hame response.json() method ko call karna padega 
                            // jo ek promise retun karega : 
  )

 fetch(url)
   .then(
    (response)=>{

        if(response.ok){
            // console.log(response.json()); // return the promise 
        return response.json();
        }
        else{
            throw new Error("Something went wrong !!!");
        }
         
    }
   )
   .then(
    (data)=>{
        console.log(data);
        return data;
    }
   )
   .then(
    (data)=>{
        const id = data[3].id;
        console.log(id);
        const url1 = `${url}/${id}`
        return fetch(url1);

    }
   )
   .catch(
    (error)=>{
        console.log("inside the catch : ");
        console.log("error : ");
        console.log(error);
    }
   )
   // fetch tabhi reject hoga jab  network related problem ho : 
   