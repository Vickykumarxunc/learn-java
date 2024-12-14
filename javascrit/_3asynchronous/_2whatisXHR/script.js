//? xhr - > xml http request; 
/*
jab hum kisi bhi function ko new keyword ka use kar ke 
call karte hai to ve ek object return karta hai : 
bydefault function ke return value undefined hoti hai : 

xmlhttprequest bhi ke function jisko hum new keyword ka use kar ke call karte hai . 
jo ek object return karke deta hai aur us object ke aage ek label bhi laga hota hai  . 
 */

const button = document.querySelector('.button');
const image = document.querySelector('img');

button.addEventListener('click' , ()=>{
    const xhr = new XMLHttpRequest(); // creat a new object : 
    console.log(xhr);

    xhr.responseType = 'json'; // set the response type json : 

    // ab hame kaishe pata chalega ki api se data kab aaya hai 
    // hum apne object par event listener laga dege ;
    xhr.addEventListener('load' , ()=>{ // ab hamne json par load listenr laga diya : 
        // console.log(xhr);
        // console.log(xhr.response);
        // console.log(JSON.parse(xhr.response));
        image.src = xhr.response.message; // jaishe ho data aayega image ka surce change ho jayega : 
    })

    // method 2  to fire the load event : 
xhr.onload = () =>{
    image.src = xhr.response.message;
    console.log(xhr);
}

    // send() method ka use karke hum request send karte hai xhr object ka use karke ke:
    // open() method se hum apane object ko set karte hai :  
    // open ke ander hame request ka type aur vo url dalna hai jiske uper hame request sent karni hai : 
    xhr.open('GET' , 'https://dog.ceo/api/breeds/image/random');
    xhr.send();
})