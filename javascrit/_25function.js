//? function : 
console.log("hay");
console.log("hay my name is anurag : ");
console.log("i study the web developer");

//? function defination 
function sum(a , b)
{
    return a + b;
}

//? function calling : 
const ans = sum(3 , 5);
console.log(ans);
console.log(typeof sum);


function star(n)
{
    for(let i = 0; i<n; i++)
    {
        let str =  "";
        for(let j = 0; j<=i; j++)
        {
            str += "* ";
        }
        console.log(str);
    }
}
star(5);

//? hum function me default value bhi set kar sakte hai : 
//? agar hum function me argument ki kuch bhi value na pass kare to default value hum use kar sakte hai : 
function introduction(username = "ronak") //? ronak is the default value of username 
{
    console.log(`hay my name is ${username}`);
}

introduction("vicky");
introduction();

//? function expression : 
const fun = function(a , b){
    return a  + b;
}
console.log(fun(4 , 5 ));

function biodata(username , professiont , age)
{
    console.log(`my name is ${username} and my profession is ${professiont} , and my age is ${age}`);
}

biodata("vicky" , "software engineer" , 19);

