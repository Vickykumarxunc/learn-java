
// callback function : 
function sayhi(){
    console.log("hello world");
}
function hello(callback){
     callback();
}
hello(sayhi);

function myfunction(callback){
  console.log("function is doing task 1 : ");
  callback();
}

myfunction(()=>{
    console.log("function is doing task 2 : ");
})

function getTwoNumber(a , b , callback){
    console.log(a , b);

    if(typeof a === 'number' && typeof b === 'number')
    callback(a , b);
    else{
    console.log("wrong data typee");
    }
}

function addTwoNumber(num1 , num2){
    console.log(num1 + num2);
}
getTwoNumber(7 , 3 , addTwoNumber);