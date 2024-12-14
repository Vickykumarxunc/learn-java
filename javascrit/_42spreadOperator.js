//? spread operator (...) which is used to concat one or more array or object or string 
//? spread operator spread the string as a key value pair 
//? spread se hum object ko iterate nahi kar skte : 
//? spread operator ko hum function calline ke dauran use karte hai : 

const num1 = [1 , 2 , 3 ];
const num2 = [4 , 5 , 6 ];
const num3 = [...num1 , ...num2];
console.log(num3);


const str = "vicky";
const str_array = [...str];
console.log(str_array);

const obj1 = {
    firstName : "vicky",
    lastName : "kumar",
    brother : "ronak",
    age : 20,
    color : "black",
    city : "garhiNoabad"
}

const obj2 = {...obj1 , wieght : 54};
console.log(obj2);


function add(){
    let sum = 0;
     const args = Array.from(arguments);
     for(let i = 0; i<args.length; i++)
     {
        sum += args[i];
     }
    return sum;
}
 const ans = add(1 , 2 , 3 );
 console.log(ans);
console.log(typeof ans);

const arr1 = [1 , 2 , 3 , 4 , 5];
const arr2 = [6 , 7 , 8 , 9 , 10];
const jointArray = [...arr1 , ...arr2];

function addAll(){
    let sum = 0;
    for(let i = 0; i<arguments.length; i++)
    {
        sum += arguments[i];
    }
    return sum;
}

const addAns = addAll(...jointArray);
console.log(addAns);
