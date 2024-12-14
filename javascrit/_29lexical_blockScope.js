//? lexical scope or block scope : 

const city = "giarhi noabad";
function substract()
{
    const city = "garhi noabad";
    const x = 19;
    const y = 10;
    const z = 30;
    console.log(x - y);
    console.log(city);

    function child()
    {
        const name = "golu";
        console.log(name);
        console.log(city);
        console.log(z);
    }
    child();

}

substract();

//? closure -> inner function ke ander jab hum outer function ka variable ko use karte hai to inner function ek closure bana leta hai matlab inner function sath us variable ki information bhi attach ho jati ha : 
//? outer function ka variable ki information inner functin ke sath attach ho jati hai that is called closure : 
 
 
//? lexical scope -> jo inner function hote hai uske pas outer function ka scope hota hai inner function outer function ki property ko use kar sakta hai 
//?                 aur jo outer function hote hai unke paas inner function ka access nahi hota hai outer function inner funtion ki property ko use nahi kar sakte hai : 
 
function grand(){
    const  name = "ishawar";
     const age = 60;
     const son_age = 40;
     console.log(name);
     console.log(age);
     console.log(son_age);
     const elder_son = "devendra";

    function parent(){
        console.log(`my age is ${son_age}`);
        const son_age1 = 19;
        function child()
        {
            console.log(`my age is ${son_age1}`);
            const my_name = "vicky";
            console.log(my_name);
            const son = "hai nahi ";
            const mypapa  = elder_son;
            console.log(mypapa);


        }
        child();

    }
    parent();

}

grand();


//? variable is declare inside the block only access inside the block is called block scope
//? let and const have block scope 
//? var have a global scope we can access the var varibable outside the block :
 
{
    var a = 10;
    let  b= 30;
    const c = 3;

    console.log(a);
    console.log(b);
    console.log(c);


}

console.log(a);
// console.log(let); not access : 

//? agar hum variable ko bina keyword ka declare karte hai to vo variable direct window ke ander chala jata hai
//? fir us variable ko hum functio ke bahar bhi access kar sakte hai : 

//? we can use the "use strict" to avoid the declare variable without keyword : 