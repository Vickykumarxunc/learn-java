//? ternary operator 
//? (expression1)?(expression 2): (epxression 3)
//? expression 1 is any condition relation or funciton call 
//? expression 2 any thing it is execute if condition is true : 
//? expression 3 any thing it is execute if condition is false : 

let number = +prompt("enter the any number ");
(number % 2 === 0)? console.log(`${number} is even`) : console.log(`${number} is odd`); 


//? find greater three number : 
let a = 43 , b = 200 , c = 30;
((a > b) && (a > c)) ? console.log(`${a} is greater than ${b} and ${c}`) : ((b > c) && (b > a)? console.log(`${b} is greater than ${a} and ${c}`) : console.log(`${c} is greater than ${a} and ${b}`));

let num = 10;
(num = 10)? console.log(num + " true block execute : ") : console.log("false value ");
