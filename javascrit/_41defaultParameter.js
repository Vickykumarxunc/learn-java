
function mul(a , b){
    return a * b;
}
const mulans = mul(3 , 8); // pass the parameter 
console.log(mulans);


//? b is the default parameter 
//? agar b ki value function ki nahi mili hai to vo by default jo hamne assign ke hai vo le lega : 
 function add(a , b = 0){
    return a + b;

}
const addans = add(4 , 10);
console.log(addans);

//? old method to pass the default parameter  : 
function sub(a , b){
    if(b === undefined){
        b = 0;
    }
    return a - b;
}
const subans = sub(4 , 10);
console.log(subans);

function print(a , b ){ // b is a default parameter hamne b is value by default fix kar di hai : 
    console.log(`value of a is = ${a} and value of b is = ${b || 4}`);
}
print(10);
 
//? default parameter example : 
function rollADice(numberOfSides)
{
    if(numberOfSides === undefined){           
        numberOfSides = 6;
    }

    return Math.floor(Math.random() * numberOfSides ) + 1;
}

console.log(rollADice());