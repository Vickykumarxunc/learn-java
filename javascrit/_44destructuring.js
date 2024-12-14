//? 1/oct/2024........................
 const color = ['red ' , 'green' , 'yellow' , 'pink' , 'black'];

 const color2 = color[2];
 const color1 = color[1];
 const color0 = color[0];
console.log(color2);
console.log(color1);
console.log(color0);

//? desctructuring : 
//? the destructuring assignment syntax is a javascript expression that makes it possible to unpack values from array
//? or properties from objects into distinct variables 
const [value1 , value2 , value3 , ...rest] = color;
//? color ki first value value1 me store hogi
//? color ki second value value2 me store hogi
//? color ki third value value3 me store hogi 
//? color ki rest value rest parameter me chali jayegi 
console.log(value1);
console.log(value2);
console.log(value3);
console.log(rest);

//? how to skip the -> hum  extra comma lagakar value ko skip kar skte hai 
const num_arr = [1 , 2 , 3 , 4 , 5 , 6];
const [num1 , num2 , num3 , ,  num4] = num_arr;
console.log(num1); // num_ arr ki first value  1
console.log(num2); // num_arr ki second value 2
console.log(num3); // num_arr ki thrid value 3 
console.log(num4); // num_arr ki fifth value 5 kyoki hame extra comma lagakr ek value ko skip kar diya

const user = {
    firstName : "vicky",
    lastName : "kumar",
    age : 19,
    address : {
        city : "muzaffarnagar",
        state : "uttarpradesh"
    }
};

//? manaual access the value 
const name = user.name;
const age = user.age;
console.log(name);
console.log(age);

//? by the desctrucrign :
//? object ko destruct karne ke liye hame object ki key ka hi naam lena padta hai as a variable :  
const {firstName , lastName} = user;
console.log(firstName);
console.log(lastName);

//?  agar hum cahte hai ki object ke key alag naam le 
const {firstName:myname , age:myage} = user;
console.log(myname);
console.log(myage);

const {city:mycity , state:mystate} = user.address;
console.log(mycity);
console.log(mystate);

// second way
const {address} = user;
console.log(address);

// multilevel destructuring : 
const {address:{city}} = user;
console.log(city); // address ke ander jo city hai vo destruct ho jaye: 

const color_array = ['white' , 'black' , 'red' , 'green' , 'grey' , 'brown' , 'cyan'];

// me directly kisi bhi index ke color ko kaishe acceess kar sakta hoon 
 
const {3 : color4 ,  5 : color6} = color_array;
console.log(color4);
console.log(color6);


{
    //? function me destructuring : 
    function intro({firstName}){
        console.log(firstName);
    }
    function intro1({lastName:mylastname}){
        console.log(mylastname);
    }
    function printcolor(color_array){
        console.log(color_array);
    }
    function printcolor2([a , b , ...rest]){
        console.log(a); // first color from the color array 
        console.log(b); // second color from the color array 
        console.log(rest); // rest color fromt eh color array 
    }
    function printcolor3({3 : color4}){
        console.log(color4); // 4th color from the color_array 

    }
}
intro(user);
intro1(user);
printcolor(color_array);
printcolor2(color_array);
printcolor3(color_array);
