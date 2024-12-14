
//? function decleration : 
function cube(a){
    return a ** 3;
}
 console.log(cube(3));

 //? function expression : 
 const cube2 = function(a){
    return a ** 3;
 }
 console.log(cube2(3));

 //? arrow function : 
  const cube3 = (a)=>{
    return a ** 3;
  }

  //? agar hamare code me ek hi line hai to return likhne ki jarurat nahi hai 
  //? curli braces bhi lagane ki jarurat nahi hai :: 

  const isEven = (a) => a % 2 === 0 ? console.log("is even :"):console.log("not even ");
  isEven(40);

  //? this is called implicit return function apane aap hi without return function ke value ko return kar raha hai : 
  const square = (a) => a * a;
  console.log(square(5));

  const addtwo = (a , b) => a + b;
  console.log(addtwo(4 , 3));


  //? this is a arrow function : 
  setTimeout(()=>{
    console.log("ke hai hai ");
  } , 2000);

  const random = () => Math.random() * 10;
  console.log(random());

  //? agar hamare code me ek hi argument hai to parenthesis laganae ki bhi jarurat nahi hai : ()
  const perfect_square = num => num ** 0.5;
  console.log(perfect_square(81));