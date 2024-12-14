//? object :;;;;;;;;;;;;;;;;;;;
//? there is only one type of non primitive data type that is called object
//? it is also called as reference type : 

//? object are further divided into three categories : 
//? 1. object literals 
//? 2. arrays
//? 3. functions 


//? how to create object ...........................
const obj = {}; //? this is a empty object;
console.log(obj);
console.log(typeof obj);

//? object store the any data in key value pair form 

//? (.) dot operator se hum object ki value ko le sakte hai .

//? [] bracket notation se bhi hum object ke data ko access kar sakte hai : 

//? each and every object have a different memory address :  

//? non primitive data type me hum value ko compare nahi karte 

//? jab hum do non primitive data type of compare karte hai to hum unki value ko compare na karke unke address ko compare karte hai : 

//? jab to primitive data type ko compare karte hai to unki actual value compare hoti hai : 

//? jo value object ke ander access nahi karti vo hoti hai undefined : 

//? hum bracket notation se variable ko bhi access kar sakte hai : 

const user = {
    firstName : "vicky" ,
    lastName : "kumar" ,
    age: 25 ,
    city : "garhi Noabad",
    "father name" : "devendra kumar"
};
console.log(user);
console.log(user.firstName);
console.log(user.lastName);
console.log(user["firstName"]);
console.log(user["father name"]);


const obj1 = {
    firstName : "ronak",
    lastName : "kumar",
    age : 14,
    gender : "male"
};

const obj2 = {
    firstName : "ronak",
    lastName : "kumar",
    age : 14,
    gender : "male"
};

console.log(obj1 == obj2);
console.log(obj1 === obj2);


const myName = "vicky";
const myAge = 18;
const obj3 = {
    firstName : "vansh",
    lastName : "hello",
    "last name" : "kumar",
    vicky : "developer",
    18 : 22
}

console.log(obj3.firstName);
console.log(obj3["first" + "Name"]);
console.log(obj3["last name"]);
console.log(obj3[myName]);
console.log(obj3[myAge]);

//? how to update and the add new   object key value  : 
obj3.firstName = "ronak";
obj3.lastname = "kumar"
obj3.age = 21;

console.log(obj3.firstName);
console.log(obj3.lastName);
console.log(obj3.age);

obj3.color = "red";
console.log(obj3.color);
console.log(obj3);


//? object inside the object ..............................
//? nested object ka bhi alag alag address hota 
//? har ek object ke liye ek new memeory allocate hoti hai. 
const grantobj = {
    firstname : "rohit",
    lastname : "kumar",
    gender : "male",
    address : {
        village : "garhi Noabad",
        pincode : 251309,
        state : "uttar pradesh",
        district : "muzaffar Nagar ",
        moreDetails : {
            population : 6398584469,
            area : "near postOffice",
            citizen : "indian"
        }
    },

    age : 23

    

}
console.log(grantobj);
console.log(grantobj.address);
console.log(grantobj.address.district);
console.log(grantobj.address.village);
console.log(grantobj.address.moreDetails.population);
console.log(grantobj);
console.log(grantobj === grantobj.address);

grantobj.address.moreDetails.jobProfile = "software Engineer";
console.log(grantobj.address.moreDetails["jobProfile"]);