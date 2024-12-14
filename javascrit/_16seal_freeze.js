//? object.seal() and object.freeze() 

//? object is declared by const keyword but object also changable how 
//? kyoi not change the address . 
//? par jab hum object ko let se declare karte hai to value add or delete karne par uska address change ho jata hai . 
const user = {
    fisrtName : "vicky",
    lastName : "kumar",
    pata : {
        district : "muzaffarNagar",
        village : "garhiNoabad",
        state : "uttar pradesh",
        more_detials : {
            population : 6398584469,
            area : "787 sq km",
            citizen : "indian"
        }
    },
    age : 15,
    isGraduate : false
}

//? jab hum kisi bhi variable ko change karte hai to actual me us variable ka address change karte hai : 
let a = 10;
a = 30;

user.mobileNo = 6398584469;

Object.freeze(user);
Object.seal(user);
//? delete keyword in javascript : 
 const ans = delete user.firstName;
 console.log(ans);
 

//? how to avoid the changes in object 
//? na to koi usme se value add kare aur na hi koi value delete kare : 
//? to uske liye hame use karna hoga object.seal

 
//? how to check any key is exist inside the object or not 
//? use in keyword
console.log("firstname" in user);
console.log("lastName" in user);
console.log("state" in user.pata);

//? object.isSealed() se hum pata karte hai ki object sealed hai ya nahi 
//? object.isfrozen() se hum pata karte hai ki object freeze hai ya nahi
