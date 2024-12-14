
// promise.resolve();
/* 
promise.resolve ke value lega jo return karege promise jo resolve ho kar ek value dega : 

*/

const new_Promise = Promise.resolve(10);

new_Promise.then(
    (resolve)=>{
        console.log(resolve);
    }
) 
  

// then method always promise return karta hai : 
// isse hum promise ki chain create kar sakte hai : 

function myPromise(){
    return new Promise((resolve , reject)=>{
     resolve("foo");
    })
}

myPromise().then(
    (value)=>{
        console.log(value);
        value += "bar";
        // return value; // internally ye ek promise return karega update value ke sath : 
        return Promise.resolve(value);
    }
).then(
    (value)=>{
        console.log(value);
        value += "vicky";

        return value;
    }
).then(
    (value)=>{
        console.log(value);
         
    }
).then(
    (value)=>{
        console.log(value);
    }
)

/// agar me return na likhta to by default promise undefined value ke sath return hoga : 
// so promise always return hoga  : 