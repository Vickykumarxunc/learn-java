//? dialog boxes ............
//? there are three type of dialog box : 
//? 1. alert("your message goes here");
//? 2. confirm("your message goes here");
//? 3. prompt("your message goes here");
 

// alert("goes your message here : ");
//? alert ke case hamare pass ek message aayega jb tak hum message par ok click nahi karege 
//? to tak screent par kuch bhi nahi dikhega > 
//? phle js ka code finish hoga fir vo html ka code dikhayega.   
//? alert undefined return karta hai . 


// confirm("your message goes here : ");
//? confirm bhi alert ke trh same hai but isme to option aate hai one is ok and another one is cancel 
//? confirm hamko true or false value return karta hai 
//? click on ok -> return true. 
//? click on cancel -> return false;
//? hum return ki hui value ko store bhi kar sakte hai . 

const confirmValue = confirm("hay");
console.log(confirmValue);

const userInput = prompt("please enter your name : ");
console.log(userInput); 

//? prompt hum userInput lene ke liye karte hai : 
//? jab hum prompt me cancel kar dete hai to  vo hame null deta hai. 

 