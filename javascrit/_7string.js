//? string method : 

//? string is indexed . 
//? index start from 0 1 2 3 ... 

const name = "vicky";
console.log(name);
console.log(name[0]);
console.log(name[1]);
console.log(name[2]);
console.log(name[3]);
console.log(name[4]);
console.log(name[5]);

//? string has only one property 
//? 1. length property -> it give the length of the string : 

const firstName = "ronak";
console.log(firstName.length);

//? how to access last character of the string : 
console.log(firstName[firstName.length - 1]);


//? string method : (without argument)
//? 1. toUpperCase();
//? 2. toLowerCase();
//? 3. trim();
//? 4. trimStart();
//? 5. trimEnd();

//? string ke method hamko ek new string return kare ke dete hai ye original string me koi modification nahi karte . 

const lower = "vicky";
const upper = lower.toUpperCase();
console.log(upper);
console.log(lower.toUpperCase())
console.log(lower);

 const upper1 = "RONAK";
 const lower1  = upper1.toLowerCase();
 console.log(lower1);
 console.log(upper1);

 //? trim() -> starting ke extra space ko remove kar deta hai : 
 const faltuspace = "     vickykumar      " + "ronak ";
 console.log(faltuspace);
 const goodmessage = faltuspace.trim();
 console.log(goodmessage.toUpperCase());

 console.log(goodmessage.trimStart());
 console.log(goodmessage.trimEnd());

 
 //? method with arguments ........................
 //? 1. includes();
 //? 2. indexOf();
 //? 3. replace();
 //? 4. replaceall();
 //? 5. concat();
 //? 6. padStart();
 //? 7. padEnd();
 //? 8. charAt();
 //? 9. charCodeAt();
  


 //? 1. includes() -> method super string me substring ko check karta hai ke usme present hai ya nahi . 
 //?                  agar substring present hai return -> true
 //?                  agar substring presnt nahi hai return -> false. 

 let str = "i am a good boy ";
 console.log(str);
 let find = str.includes("good");
 console.log(find);
 
 find = str.includes("bad");
 console.log(find);



 //? 2. indexOf() -> ye hame kisi bhi character ke index return karke deta hai :
 //?                 jo character string me exist nahi karta uske liye -1 deta hai :  
 
 let ind = "vicky kumar";
 console.log(ind.indexOf("k"));
 console.log(ind.indexOf('j'));
 console.log(ind.indexOf("vicky")); //? string ke case me string ke 1st character ka data deta hai : 
 console.log(ind.indexOf("kumar"));

 //? 3. replace("old" , "new") -> ye old character ko new character se replace kar de ga . 
 //?                             ye sirf first character ko repace karta hai . 

 let rep = "i am a good boy";
 console.log(rep.replace("good" , "bad"));
 console.log(rep.replace("a" , 'A')); 

//? 4. replaceAll() -> ye ek jaishe sabhi character ko new character se replace kar deta hai. 
let repall = "malayalam";
console.log(repall.replaceAll("a" , "A"));
console.log(repall.replaceAll("m" ,  "M"));



//? 5. concat() -> ye do string ke add kar deta hai : 
let str1 = "vicky";
let str2 = "kumar";
let final = str1.concat( " " ,  str2 , " kajal");
console.log(final);


//? 6. padStart(maxlength , "kis ko repeat karna ha") -> ye kisi number ke starting me star laga deta hai 
//?                 like as - > ******123  pad se hum kuch number ko hide karte hai .
let pad = "1234";
let padNum = pad.padStart(16 , "*");
console.log(padNum , padNum.length);


//? 7. padEnd(maxlength , "kis ko add karna hai") -> ye end number ko hide kar dega : 
let padend = "1234";
let padnum = padend.padEnd(7 , ".");
console.log(padnum);


//? 8. charAt() -> charAt(index no) hame kisi bhi particular index ka character hame return karke deta hai. 
let myName = "vicky kumar";
let char = myName.charAt(myName.length - 1);
console.log(char);


//? 9. charCodeAt(index no ) -> ye hamko character ki ascii value deta hai : 
let char1 = "ABCDE";
let charcode = char1.charCodeAt(1);
console.log(charcode);
console.log(char1.charCodeAt(4));