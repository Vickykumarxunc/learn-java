//? 26/sep/2024..........................
 //? switch statement : : : : : 

let num = +prompt("enter the day number : ");
switch(num)
{
    case 1 : console.log("Monday");
    break;
    case 2 : console.log("Tuesday");
    break;
    case 3 : console.log("wednesday");
    break;
    case 4 : console.log("thrusday");
    break;
    case 5 : console.log("friday");
    break; 
    case 6 : console.log("saturday");
    break;
    case 7 : console.log("sunday");
    break; 
    default : console.log("enter a valid number : ");
    break;
}

let x = +prompt("enter the first number : ")
let y = +prompt("enter the second number ");
let z = +prompt("for add = 1 , sub = 2 , mul = 3 , div = 4")
switch(z)
{
    case 1 : console.log(x + y);
    break;
    case 2 : console.log(x - y);
    break;
    case 3 : console.log(x * y);
    break;
    case 4 : console.log(x / y);
    break;
    default : console.log("enter valid number ");
    break;
}
 
 