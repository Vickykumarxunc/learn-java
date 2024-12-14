
//? foreach array method : 
const fruits = ['apple' , 'banana' , 'mango' , 'grapes'];


//? forEach method is a higer-order method because it accepts the callback function 
//? as its argument , which is execute for each element in the array : 

fruits.forEach((fruit)=>{
    console.log(fruit)
})
fruits.forEach(function(fruit){
    console.log(fruit);
})

const array = [1 , 2 , 3 , 4 , 5 , 6 ];
array.forEach((arr)=>{
    console.log(arr * 2);
})

//? forEach ka ander hum outsider function bhi dal sakte hai 
function print(a , index , arr){
    console.log(`${a} : ${index} : ${arr}`);
}
array.forEach(print);

const str = ['vicky' , 'ronak' , 'kajal'];
str.forEach((a)=>{
    console.log(a);
})
const ans = str.forEach((a)=>{
    console.log(a.toUpperCase());
     
})

//? for each ki return value undefined hoti hai : 
//? for each does not produce a return value 
console.log(ans);
 

//? it does not produce a new array or modify the orginal array : 

