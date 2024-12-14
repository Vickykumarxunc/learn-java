//? 27/sep/2024......................

//? array store the multiple element of different data type 
//? type of array is object :
//? array indexing start from zero :
//? array have a length property : /
//? how to check is an array :   

const arr1 = ["apple" , "banana" , "grapes" , "dates"];
console.log(arr1);
console.log(typeof arr1);
console.log(arr1.length);
console.log(arr1[0]);
console.log(arr1[1]);
console.log(arr1[2]);

//? we can modify the value of array : 
arr1[1] = 2024;
arr1[2] = 5000;
console.log(arr1);
console.log(arr1[arr1.length - 1]);

//? array is a non-primitive data type compare the address of the array : 
const arr2 = [1 , 2 , 3 , 4];
const arr3 = [1 , 2 , 3 , 4 ];
console.log(arr2 === arr3);

//? const ke case me array jab array dega tab uska pura ka pura address hi change kar dege by taking the new array of same variable 
// arr2 = [1 , 9 , 4 ]; //? it give an error 

 //? hum array me new element bhi add kar sakte hai 
 arr2[arr2.length] = "vicky";
 console.log(arr2);

 //? hum array me object bhi add kar sakte hai : 
 const arr4 = [
    'apple' , 'mango' , 'peas' ,  {firstName : "vicky",
                                   lastName : "kumar",
                                   age : 18,
                                   city : "muzafferNager",
                                   village : "garhiNoabad",

                                  }
 ];

 console.log(arr4);
 console.log(arr4[3].firstName);
 console.log(arr4[3].lastName);
 console.log(arr4[10]);
 //? agar out of the length of array se element ko access karte to vo undefined deta hai .


 //? baki ke element ko ye undefind dede ga : 
 const arr5 = [1 , 2 , 3 , 4 ];
 arr5[10] = "vicky";
 console.log(arr5[6]);
 console.log(arr5[10]);
 console.log(arr5);


 //? how to add element in array at last using push() method : 
 //? push() method hamko new array ka length return karke bhi  deta hai : 
 //? we can add the multiple value at a one time using push method : 
 const  arr6 = [1 , 2 , 3 , 4 ,5];
 let newlen = arr6.push("last");
 console.log(arr6);
 console.log(`new length of the array : = ${newlen}`);

 newlen = arr6.push(6 , 7 , 8 , 9 , 10);
 console.log(newlen);
 console.log(arr6);


 //? how to remove element in array at last using pop() method : 
 //? o
 const arr7 = [1 , 2 , 3 , 4 , 5 ];
 console.log(arr7);
  let popelement = arr7.pop();
 console.log(arr7);
 console.log(popelement);

 //? agar hum empty array me se element ko pop karte hai to vo hame undefined deta hai : 
 const arr8 = [];
 let a = arr8.pop();
 console.log(a);

