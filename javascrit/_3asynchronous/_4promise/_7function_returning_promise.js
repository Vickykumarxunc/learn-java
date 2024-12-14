
// function returning promise :::::: 

// this is the function returning function : 
function ricePromise(){

    const bucket = ["coffee" , "chips" , "vegetable" , "salt" , 'rice'];

    return new Promise((resolve , reject)=>{

        if(bucket.includes("salt") && bucket.includes("vegetable") && bucket.includes("rice")){
            resolve({value : "fried rice"});
        }
        else{
            reject(new error("could not do it "));
        }
    })
}

// how to to consume promise which is return by the function : 
// function ko call karke hum promise ko consume kar sakte hai : 
ricePromise().then(
    (resolve)=>{
        console.log(resolve);
    }

).catch(
    (error)=>{
        console.log(error);
    }
)