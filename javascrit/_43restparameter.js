//? rest parameter ko hum function defination me as a function argument use karte hai 
//? jo rest parameter ko as an array ki form me store kar leta hai : 


//? the rest parameter allow a function to accept an indefinite number of argument as an array 
function sum(...theArgs){
    let total = 0;
    for(let element of theArgs){
        total += element;
    }
    return total;
}
const sum_ans = sum(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8);
console.log(sum_ans);

//? a function defination can only have one rest parameter 
//? the rest parameter must be the last parameter in the function defination 
//? trailing commas are not allows after the rest parameter 
//? rest parameter cannot have default value 

function myfun(a , b , ...rest){
    console.log(a);
    console.log(b);
    console.log(rest);
}
myfun(1 , 2 , 3 , 4 , 5 , 6 , 7 );

//? spread value ko spread karta hia 
//? jabki rest param value ko collect karke unko ek array ke ander dal deta hai 

function add(...num){
    console.log(Array.isArray(num));
    let sum = 0;
    for(let i = 0; i<num.length; i++)
    {
        sum += num[i];
    }
    return sum;
}
const add_ans = add(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ,9 , 10);
console.log(add_ans);


function logic(a , b , ...rest){
    console.log(rest);
    return a + b;
}
console.log(logic(...[1 , 2 , 3 , 4 , 5 , 6 ]));

//? agar rest parameter ko bhi value nahi milti hai to vo empty array deta hai : 
function zero_rest(a , b , c , ...rest){
    console.log(a);
    console.log(b);
    console.log(c);
    console.log(rest);
}

zero_rest(1 , 2 , 3);

//? rest parameter is an actual array we use the array inbuild method on the rest param directly 

function filter_out(...arr){
    const return_value = arr.filter((el) =>{
        return el % 2 === 0;
    })
   return return_value;
}

const ans_arr = filter_out(1 , 2 , 3 ,4 , 5 , 6);
console.log(ans_arr);

 const even_sum = ans_arr.reduce((accumulator , current)=>{
    return accumulator + current;
 } , 0);

 console.log(even_sum);