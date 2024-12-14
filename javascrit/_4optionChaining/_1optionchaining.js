/*
* optionl chaining  : (nested property ko aasani se access kar sakte hai : )
optional chaning (?.) in javascript is a syntac features that allows you to safely access deeply 
nested properties of an object without haing to check if each property in the chain exists. 
if any property in the chaing is null or undefined the entire expression evaluate to undefined instead of throwing an error . 

 */

const user = {
    name : "vicky",
    age : 19,
    address : {
        city : "garhi Noabad",
        pincode : 251309
    }
}

// access the property safely : 
console.log(user?.address?.city); // output -> garhiNoabad 
console.log(user?.address?.street); // output -> undefined (no error) 


// without optional chaining 
console.log(user.address.city); // garhi noabad 

const employee = null 
console.log(employee?.name); // unfined (no error)

//* optional chaining with array : 
const users = [
    {
        name : "vicky",
        age :19,
        gender : "male"
    },
    {
        name : "ronak",
        age : 15,
        gender : "male"
    }
]

console.log(users[1]?.name); // ronak
console.log(users[2]?.name); // undefined (no error)


// * optional chaining with methods : 
const person = {
    greet(){
        return "hello";
    }
}
console.log(person?.greet?.());
console.log(employee?.greet?.());

 
/*
 *keypoint  : 
 it prevents errors like cannot read property 'x of undefined . 
 it is especially useful when working with data from apis or large nested object .
 if the option chaining operator short-circuits (null or undefined is encounter) it stops evaluations and return undefined .  

 */