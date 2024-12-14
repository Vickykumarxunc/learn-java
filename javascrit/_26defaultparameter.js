//? default parameter 

//? old method if vlue of the parameter is not given 
function introduction(username)
{
    if(username === undefined)
    {
        username = "god";
    }
    console.log(`my name is ${username}`);
}
introduction();
introduction("vicky");

//? new version that is default parameter : 
function myself(username = "ronak")
{
    console.log(`my name is ${username}`);
    

}
myself("vicky");
myself();

//? another method use the or (||) operator and string literal
function myname(username)
{
    console.log("hi");
    console.log(`my name is ${username || 'vicky'}`);
    console.log('i am a developr');
}
myname();


function _2tothepower(n , m)
{
    return n ** m;
}

const ans2 = _2tothepower(2 , 3);
console.log(ans2);

function table(n)
{
    for(let i = 1; i<=10; i++)
    {
        console.log(`${n} X ${i} = ${n * i}`);
    }
}

table(2);

function swap(a , b)
{
    let temp = a;
    a = b;
    b = temp;
    console.log(a);
    console.log(b);
}
swap(2 , 3);


function addtwoNumber(a , b)
{
    return a + b;
}

const add = addtwoNumber(addtwoNumber(1 , 2) , addtwoNumber(3 , 4));
console.log(add);
 