
// return data from the async function : 
const url = 'https://jsonplaceholder.typicode.com/todos/1';

async function request() {

    const response =  await fetch(url);
    const data = await response.json();
    return data;  /// it return the promise  
}
 
const data = request();
data.then(
    (resolve)=>{
        console.log(resolve); // actual data : 
    }
).catch(
    (reject)=>{
        console.log("some thing went wrong : ");
    }
)