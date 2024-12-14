const fruits = ['apple' , 'banana' , 'cactus' , 'peach' , 'mango'];

//for loop : 
// for loop hamko array ki value or index ko bhi return karke deta hai : 
for(let i = 0; i<fruits.length; i++)
{
    console.log(fruits[i]);
    
}

//for  of loop :
// for of loop har ek element ki liye run karte hai : 
// ye hamko array  ki value ko provide karta hai : 
for(let fruit of fruits){
    console.log(fruit);
}

const str = "vicky";
for(let st of str)
{
    console.log(st);
}

const person = {
    firstname : "vicky",
    lastname : "ronak",
    age : 15,
    color : "black"
}

// for(let i = 0; i<person.length; i++)
// {
//     console.log(person);
// }

// for(let value of person)
// {
//     console.log(value);
// }

//? object is not iterable by the simple for loop and for of loop :
//? but with the help of for in loop object is iterable  : 

//? it print the all key of object : 
for(let key in person)
{
    console.log(key);
}

//? how to access object value by using the for in loop 
for(let key in person)
{
    console.log(person[key]);
}

//? how to access key value pair using the for in loop 
for(let key in person)
{
    console.log(`${key} : ${person[key]}`);
}

//? how two access the all key of object : 
//? we use the Object.keys -> it return the all key of object in the form of array : 
 console.log(Object.keys(person));

 const key_arr = Object.keys(person);
 console.log(key_arr);
 console.log(Array.isArray(key_arr));
 console.log(typeof key_arr);

 //? how to access the all value of object : 
 //? we use the Object.value  -> it return the all value of object in the form of array  : 
  console.log(Object.values(person));
  
  const value_arr = Object.values(person);
  console.log(value_arr);
  console.log(typeof value_arr);
  console.log(Array.isArray(value_arr));

//? how to access the key value pair both simultaneously of object ; 
//? we use the Object.entries 
//? it return the two d array array inside the array : 
const key_value = Object.entries(person);
console.log(key_value);
console.log(typeof key_value);
console.log(Array.isArray(key_value));



const array = [1 , 2 , 3 , 4 , 5 ];
for(let index in array)
{
    console.log(`index = ${index}  : element =  ${array[index]}`);
}