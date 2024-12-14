//? 1/oct/2024 : 
//? each and every function except arrow function have an arguments : 
function add(a , b){
    console.log(arguments);
    console.log(a + b);
}

add(3 , 4 );

//? arguments is an array-like object accessible inside functions that contains the value of the argument
//? passed to the function : 

function fun1(a , b , c){
    console.log(arguments); //[1 , 2 , 3 ]
    console.log(arguments[0]); // 1
    console.log(arguments[1]); // 2
    console.log(arguments[2]); // 3
}
fun1(1 , 2 , 3 );

function fun2(){
    console.log(arguments);
    let sum = 0;
    for(let i = 0; i<arguments.length; i++)
    {
        sum += arguments[i];

    }
    return sum;
}

const ans = fun2(1 , 2 , 3 , 4 , 5 , 6);
console.log(`sum is ${ans}`);


//? arguments.length se hum arguments ki length define kar sakte hai : 
 function longestString(){
    console.log(arguments);
    let longestr = "";
    for(let i = 0; i<arguments.length; i++)
    {
        if(arguments[i].length > longestr.length){
            longestr = arguments[i];
        }
    }
    return  longestr;
 }
 const longestStr = longestString('vicky' , 'ronak' , 'kajal' , 'shankar');
 console.log(longestStr);

//? the arguments object is a local variable  within all non - arrow function . you can refer to a function arugments 
//? inside the that function by using the arguments object.
//? it has entires for each arguements the function was called with , with the first entry index at 0. 

//? we can also update the the fucntion argument value using the arguments 
function fun3(a)
{
    arguments[0] = "vicky";
    console.log(a);
    console.log(arguments);
}
fun3(10);

//? arguments does not work with arrow function : 
// const fun4 = ()=>{
//     let sum = 0;
//     for(let i = 0; i<arguments.length; i++)
//     {
//         sum += arguments[i];
//     }
//     return sum;
// }
// const ans_sum = fun4(1 , 2 , 3 , 4 , 5);
// console.log(ans_sum); // it give an error : 

//? to solve this problem of arrow function with arguments by using the rest parameter
//? rest parameter stores the many no 
 const fun5 = (...string)=>{

    let longest_string = "";

    for(let i = 0; i<string.length; i++){

        if(string[i].length > longest_string.length){

            longest_string = string[i];
        }
    }
    return longest_string;

 }
 const long_string = fun5("vicky" , 'kanha' , 'kala');
 console.log(long_string);

 //? argument is an array-like object which means that argumnet has a length property and properties index from zero
 //? but it doent have array's build in method like foreach() or map() 
 //? it can be converted to a real array using one of slice() , Array.from() or spread syntax : 

 const args = Array.from(long_string);
 console.log(Array.isArray(args));
 console.log(args);

 function doSomething(){
    let args = Array.from(arguments);
    for(let i = 0; i<args.length; i++)
    {
        args[i] = arguments[i];
    }
    return args;
    
 }
 const args_array = doSomething(1 , 2 , 3, 4 , 5 );
 console.log(args_array); //? ab jo ye argument maine doSomething function me pass kare hai vo array me convert ho gaye hai 
 console.log(Array.isArray(args_array));
 console.log(typeof args_array);

 function argument(){
    for(let i = 0; i<arguments.length; i++)
    {
        arguments[i] = arguments[i] * arguments[i];
    }
    return arguments;
 }

 const argument_ans = argument(1 , 2 , 3 , 4 , 5 );
 console.log(argument_ans);
 console.log(Array.isArray(argument_ans));

const convert_intoArray =  Array.from(argument_ans);
 console.log(Array.isArray(convert_intoArray));
 console.log(convert_intoArray);

 //? same work do with spread operator : 
 function cube(){
    console.log(arguments);
    const args = [...arguments];
    for(let i = 0; i<arguments.length; i++)
    {
        args[i] = arguments[i] ** 3;
    }
    return args;
 }

 const converted_array = cube(1 , 2 , 3 , 4 , 5);
 console.log(converted_array);
 console.log(Array.isArray(converted_array));

 const return_value = converted_array.reduce((accumulator , current)=>{
    return accumulator + current;

 } , 0);

 console.log(return_value);// sum of the all cube : 
