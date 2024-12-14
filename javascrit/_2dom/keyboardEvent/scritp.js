// key board event : 
// there are three type 
//1 keyup
//2 keydown 
//3 keypress 

// keyboard event hum kisi bhi element par laga sakte hai 
// bas vo element focus me hona cahiye : 
// jaha kar mera cursor hota hai vo focus me hota hai : 

// jo element focusable nahi hote hai
// use focus banane ke liye use dena hota hai tabindex = '0

const h1  = document.querySelector('h1');
h1.addEventListener('keypress' , (e)=>{
    console.log(e.key);
}) 

// hum jyada tar key event window par lagate hai: 
window.addEventListener('keypress' , (e)=>{
    console.log("key = " + e.key);
    // console.log(e);
})

// /// code -> it gives the code of the particular key: 
window.addEventListener('keypress' , (e)=>{
    console.log("code = " + e.code);
})

// jab mai key ko upar ki tarf chodta hoon tab keyup fire hota hai: 
// jab hum key ko press karke chodte hai tabhi key up event fire hota hai: 
window.addEventListener('keyup' , (e)=>{
    console.log(e.key);
})

 window.addEventListener('keydown' , (e)=>{
    console.log(e.key);
 })
 