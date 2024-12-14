//? 25/sep/2024 ...........................................
//? math in javascript : 

 //? addition operator (+)
 //? subtraction operator (-)
 //? multiplication operator (*)
 //? division operator  (/)
 //? reminder operator (%)
 //? exponentiation operator (**)

 console.log(12%2);
 console.log(13%2);
 console.log(400%9);

 console.log(5 ** 2);
 console.log(2 ** 3);
 console.log(3 ** 3);


 //? Math object in javascript : building Object 

 //? Math.PI it return the value of pi
 console.log(Math.PI);

 //? Math.pow() it calculate the power of any number : 
 console.log(Math.pow(4 ,  2));
 console.log(Math.pow(2 , 8));

 //? Math.sqrt() find the square of any number : 
 console.log(Math.sqrt(4));
 console.log(Math.sqrt(26));

 //? Math.floor() number ko chota karta hai : 
 console.log(Math.floor(4.5));
 console.log(Math.floor(34.89));
 console.log(Math.floor(-2.4));

 //? Math.ceil() number ko increase kar deta hai : 
 console.log(Math.ceil(4.8));
 console.log(Math.ceil(9.9999999999999));
 console.log(Math.ceil(-4.5));

 //? Math.round() 0.5 se kam hai to floor value lega : 
 //?              0.5 ke equal ya usse jyada hai to ceil value dega : 
 console.log(Math.round(3.5));
 console.log(Math.round(3.4));
console.log(Math.round(3.7));


//? Math.random() -> it give the random number between 0 and 1 
//?               -> jis number tak hame randam number cahiye to us number se function me multiply kar do : 
///?              -> ya ham ko negative me number nahi deta hai : 
console.log(Math.random());
console.log(Math.random());
console.log(Math.random());
console.log(Math.random()  * 30);
console.log(Math.random() * 20);

//? how to skip the decimal part in random number : 
let random = Math.floor(Math.random() * 255);
console.log(random);

//? how to generate the random number between two number : 
//? minimum number is include and maximum number is exclude : 

function getRandomNumber(min , max){
    return Math.floor(Math.random() * (max - min + 1) ) + min;
}
console.log(getRandomNumber(10 , 100));

//? without function : 
console.log(Math.floor(Math.random() * (100 - 10 + 1))) + 10;

//?number divide by zero give a infinity 
//? infinity data type is number : 
console.log(8/0);
console.log(-8/0);



                        



   














 







