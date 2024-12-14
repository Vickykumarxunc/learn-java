 //? decision making : ...................

 let age = 18;

 if(age >= 18)
 {
    console.log("you are eligible for vote");
 }
 else
 {
    console.log("you are not eligible for vote");
 }

 //? find the greatest number between the three number : 
 let a = 10 , b = 20 , c = 30;

 if(a > b && b > c)
 {
    console.log(`a = ${a} is greater than b = ${b} and c = ${c}`);
 }
 else if(b > c && b > a)
 {
    console.log(`b = ${b} is greater than c = ${c} and a = ${a}`);
 }
 else
 {
    console.log(`c = ${c} is greater than a = ${a} and b = ${b}`);
 }

 //? calendar : 
 let code = +prompt("enter the month number : ");
 if(code == 1)
 {
    console.log("january");
 }
 else if(code == 2)
 {
    console.log("februry");
 }
 else if(code == 3)
 {
    console.log("march");
 }
 else if(code == 4)
 {
    console.log("april");
 }
 else if(code == 5)
 {
    console.log("may");
 }
 else if(code == 6)
 {
    console.log("june");
 }
 else if(code == 7)
 {
    console.log("july");
 }
 else if(code == 8)
 {
    console.log("august");
 }
 else if(code == 9)
 {
    console.log("september");
 }
 else if(code == 10)
 {
    console.log("october");
 }
 else if(code == 11)
 {
    console.log("november");
 }
 else if(code == 12)
 {
    console.log("december");
 }
 else 
 {
    console.log("no month exist :  invalid number ");
 }


 //? make a simple calculator using two number : 
  let x = +prompt("enter the first number :");
  let y = +prompt("enter second number : ");
  let op = prompt("enter the operation : ");

  if(op === "+")
  {
    console.log(x + y);
  }
  else if(op == '-')
  {
    console.log(x - y);
  }
  else if(op == "*")
  {
    console.log(x * y);
  }
  else if(op == '/')
  {
    console.log(x/y);
  }
  else if(op == '%')
  {
    console.log(x % y);
  }
  else 
  {
    console.log("invalid number : ");
  }

  