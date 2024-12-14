//? nested deepcopy() method 

//? 1. JSON.stringify() aur JSON.parse ka use karke 
//? 2. lodash library ka istemal karke
//? 3. custom deep copy function 

{
    //? 1. JSON.stringify() and JSON.parse

    //? -> ye method simple hai lekin ismein kuch limitations hai jaise ki funciton , undefined aour
    //?   circular reference ko handle nahi karta . 

    const originalObject = {
        fistName : "vicky",
        lastName : "kumar",
        age : 19,
        address : {
            city : "garhiNobad",
            pincode : 251309
        }
    }

    const deepcopy = JSON.parse(JSON.stringify(originalObject));
    console.log(originalObject);
    console.log(deepcopy);

    originalObject.address.city = "muzaffarnagar";
    originalObject.address.pincode = 123456;

    console.log(originalObject); //? only change in original object 
    console.log(deepcopy);//? no change in copy object 


}

{
    //? 2 . Lodash library ka istemal
    //? -> agar aapko zyada flexible chahiye , to aap lodash library ka (_.cloneDeep()) method istemal kar sakte hai 
     

}