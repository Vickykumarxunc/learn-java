//? deepcopy and shallow copy  :::::::::
 

//? this is shallow copy ek array or object me kuch changes karne par dusre array par bhi reflect karti hai use shallow copy khate hai : 
//? kyoki shallow copy me multiple array or object same address ko point karte hai : (non-primitive)
const fruit  = ['apple' , 'banana' , 'mango' , 'orange'];
const myfruit = fruit;
console.log(fruit);
console.log(myfruit);

myfruit.push('melon' , 'dates');
console.log(myfruit);
console.log(fruit);


const user1 = {
    firstName : "vicky",
    lastName : "kumar"
}
const user2 = user1;
console.log(user1);
console.log(user2);

user2.lastName = "pandit";
console.log(user1);
console.log(user2);

let username1 = "vicky";
console.log(username1);

let username2 = username1;
console.log(username2);

username2 = username2 +  ' kumar';
console.log(username2);
console.log(username1);

//? primitive ke case me dono variable ko different differnet memeory assign hoti hai : 
//? primitive ke case me (=) equalto lagane se varaible ko different memory address assin ho jata hai : 


//? deep copy ......................
//? deep copy se har ek ko alag alag address milta hai : jab hum ek array or object me change karte hai to vo dursre array or object par koi effect nahi karta hai : 


{
//? 1. use Object.assign((jis ki value updata karni hai) , (new value added));
const user3 = {};
Object.assign(user3 , user1); //? user3 ki value ko update karna hia user1 ki value ka use karke : 
console.log(user3);
console.log(user1);

user3.age = 18;
user3.city = "garhiNoabad";
console.log(user3);
console.log(user1);
}

{
    //? 2. spread(...)operator  -> ek array or object ki property ko spread karke dusre array me copy kardeta hia ; 
    const user2 = {...user1 , ...'vicky'};
    console.log(user2);;
    user2.age = 18;
    console.log(user2);
    console.log(user1);

}

{
     const arr1 = [1 , 2 , 3 , 4 , 5];
     const arr2 = [];
     Object.assign(arr2 , arr1);
     console.log(arr1);
     console.log(arr2);

     arr2.push('vicky' , 'ronak');
     console.log(arr1);
     console.log(arr2);


}

{
    const arr1 = [1 , 2 , 3 , 4 ];
    const arr2 = [...arr1];
    console.log(arr1);
    console.log(arr2);
    arr1.push("vicky" , 'ronak');
    console.log(arr1);
    console.log(arr2);
}

{
//? spread operator se hum string ko bhi spread kar sakte hai 
//? as a object -> index -> key ho jayegi
//?             -> value -> value 

const str = "vicky";
const str2 =  {...str};
console.log(str);
console.log(str2);

const name = "ronak";
const name2 = [...name];
console.log(name);
console.log(name2);
}

{
    //? 3. concat()
    const arr1 = [1 , 2 , 3 , 4 , 5];
    const arr2 = [].concat(arr1 , "vicky" , "ronak");
    console.log(arr1);
    console.log(arr2);
}

{
    //? 4. slice() 
    const arr1 = [1 , 2 , 3 , 4 , 5 ];
    const arr2 = arr1.slice(0); //? slice hamko ek naya array create karke deta hai : 
    console.log(arr1);
    console.log(arr2);

    arr1.push("vicky" , 'ronak');
    console.log(arr1);
    console.log(arr2);
}

{
    const obj1 = {
        firstname : "vicky",
        lastname : "kumar",
        pata : {
            city : "garhiNoabad",
            pincode : 251309
        }
    }

    const obj2 = {...obj1};
    console.log(obj1);
    console.log(obj2);

    //? aisha karne se dono object ke city name change ho jayega :
    //? kyoki spread operator ek object ko duplicate kiya (obj1 and obj2 dono ka ddress alaga hai ) 
    //? par ko object (pata) dono object ke ander hai uska address abhi bhi same hai :  
    obj1.pata.city = "muzaffarnagar";
    console.log(obj1);
    console.log(obj2);


    //? spread operator agar object ke ander string hai to acche se copy karega( deep copy )
    //? agar object ke ander object hai to vo uske liye koi address change nahi karege (shallow copy)
    //? spread operator nested object ke case me kaam nahi karege a; 
}

{
   
}
 