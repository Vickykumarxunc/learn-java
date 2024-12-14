
// promise with the set time out : : : :: :

// i want to resolve or reject the promise after 2sec 
function myPromise(){

    return new Promise((resolve , reject)=>{

        const value = true;

        setTimeout(()=>{

            if(value){
                resolve();
            }
            else{
                reject();
            }
        }, 2000)
    })
}

// consume a promise : 
myPromise().then(
    (resolve)=>{
        console.log("resolved");
    }
).catch(
    (error)=>{
        console.log("reject");
    }
)