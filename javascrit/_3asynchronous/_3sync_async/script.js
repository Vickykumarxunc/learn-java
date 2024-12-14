const image = document.querySelector(".image");
const button = document.querySelector(".button");

button.addEventListener("click", () => {
    const xhr = new XMLHttpRequest();
    xhr.responseType = "json";
    console.log(xhr);

    xhr.addEventListener("load", () => {
        image.src = xhr.response.message;
    });

    xhr.open("GET", "https://dog.ceo/api/breeds/image/random");
    xhr.send();
});

/*
1. javascript ek time me ek hi kaam karta hai that is called single threaded .

synchoronous code -> jab code line by line execute hota hai . 
                    synchronous code main thread ko consume karta hai . 
                     

            
asynchronous code -> vo code jo line by line execute nahi hota hia . 
                    jo main thread ko consume nahi karta hai 
                    asynchronous code tabhi execute hai jab call back queue completel empty ho 
                     
                    or synchronous code completely execute ho gaya ho .
                    asynchronous code incoming code ko stop nahi karta hai . 
                    asynchronous code are hold by browser :  
*/

// this is the asynchronous code :
setTimeout(() => {
    console.log("hello world");
}, 5000);

// synchronous code ko hum block bhi kar sakte hai
// by using the dialogue box : isse main thread block ho jayega :
alert("you want to run the code: ");

// method 2 using the while loop block the main thread :
/* 
date.now() -> is a static method that returns the number of milliseconds which is january 1 1970 
date.now ka time har time badta jata hai : */

const block_btn = document.querySelector(".block_button");

block_btn.addEventListener("click", () => {
    const startTime = Date.now();
    let currentTime = startTime;

    while (startTime + 5000 > currentTime) {
        currentTime = Date.now();
    }
});
const time = Date.now();
console.log(time);

const startTime = Date.now();
let currentTime = startTime;

while (startTime + 3000 > currentTime) {
    currentTime = Date.now();
}

//? ajax ..................................................................................................................
/*
ajax - > asynchronous javascript ans xml . 

Asynchronous JavaScript and XML (Ajax, or AJAX) is a web development technique in which a web app fetches content from the server by making asynchronous HTTP requests, and uses the new content to update the relevant parts of the page without requiring a full page load. This can make the page more responsive, because only the parts that need to be updated are requested.

Ajax can be used to create single-page apps, in which the entire web app consists of a single document, which uses Ajax to update its content as needed.

Initially Ajax was implemented using the XMLHttpRequest interface, but the fetch() API is more suitable for modern web applications: it is more powerful, more flexible, and integrates better with fundamental web app technologies such as service workers. Modern web frameworks also provide abstractions for Ajax.
 */
