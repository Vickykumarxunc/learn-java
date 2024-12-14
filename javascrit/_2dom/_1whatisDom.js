//? 1/oct/2024...............

//? bom -> brower object model 
//? browser hamko window provide karta hai aur is window ko hi hum bom khte hai
//? jo hamko bahut se features provide karta hai : 

//? bom => a collection of object exposed by the browser that allow javascript to interact with the browser window ,document and other browser
//? bom includes such as window  , navigation , location , history , and screen etc . 

{
console.log(window);
console.log(location);
}

{
// location.reload se hamara page infinite time ke liye reload hota hai :
// location.reload();

// to reload the web page finite time use the settimeout
// setTimeout(() => {
//     location.reload();
    
// }, 2000); // har ek particular time ke baad hamara page reload hoga : 

}

{
console.log(location.href); // it give the url :  aur hum isko set kar sakte hai : 
// location.href = '_1index.html';
// location.href = 'https://www.google.com/search?q=what+is+bom+in+js&rlz=1C1VDKB_enIN1129IN1129&oq=what+is+bom+in+js&gs_lcrp=EgZjaHJvbWUyCQgAEEUYORiABDINCAEQABiGAxiABBiKBTINCAIQABiGAxiABBiKBTINCAMQABiGAxiABBiKBTINCAQQABiGAxiABBiKBTIKCAUQABiABBiiBNIBCDM2NjlqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8';

}

{
    //? history .............................................
   console.log(window.history);
   console.log(history.length);
   history.back(); //? history.back se hum web page ki history me peeche ki or jaate hai (one step)
   history.forward(); //? history.forward se hum web page ki history me aage ki or jaate hai : (one step)
   history.go(-1); //? history.go() ka use karke hum  directlye multiple step aage peeche ja sakte hai : 
   history.go(1);
}

{
    //? inner height : 
    console.log(innerHeight); // ye webpage ke height deta hai 
    console.log(outerHeight);
    console.log(outerHeight - innerHeight);
    console.log(innerWidth);
    console.log(outerWidth);
    
}

{
    //? open() -> ye ek naya tab kholta hai 
    //? return value window hoti hai 
    open("https://www.youtube.com/");
    console.log(window.name); // by default name is a empty string : 
    open("https://www.youtube.com/" , 'procoder'); // name is procoder : 
}

{
    //? close() -> ye tab ko close karte hai : 
    // close();
}
 {
    //? resizeTo();
    window.resizeBy(600 , 500);
    //? resizeBy() ka use karne ke liye hame batana hota hai jo hum new tab open karte hai usko resize parameter bhi pass karna padta hai 
    open("https://www.youtube.com/" , "vicky" , 'resize');

 }
 {
    //? moveTo();
    moveTo(0 , 0 ); // change the position of the browser : 
 }
 {
    //? scrollBy(); // upar ko scroll karta hai 
    scrollBy(0 , 400);

    //? scrollTo() // neeche ko scroll karta hai : 
    scrollTo(0 , 300);

 }

 {
   //? print() => webpage ko printer  print karne ke liye use karte hai print()
 }

 {
    //? document -> dom() document object model : 
 }