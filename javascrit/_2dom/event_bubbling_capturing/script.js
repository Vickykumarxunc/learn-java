const green = document.querySelector('.green');
const pink = document.querySelector(".pink");
const blue = document.querySelector(".blue");

//? event bubbling : 
// jab hum kisi parent ke child par event listner add karta hoon 
// to vo uske sath sath uske parent par bhi apply hota hai:
// event bubbling work from inside to outside : child to parent 
// jis jis element par event listener laga hai usko ye propogate karega : 

/*
event bubbling is a concept in js  that describe how events propogate or bubble up through the dom 
from child to parent . 
when a event like a click occurs on an element it doesn't just stay on that elemnt it bubble up to its ancestor : 

 */
// green.addEventListener("click"  , ()=>{
//     console.log("click green");
// })

// pink.addEventListener("click" , (e)=>{
//     e.stopPropagation();
//     console.log("click pink");

// })

// blue.addEventListener("click" , ()=>{
//     console.log("click blue");
// })

// document.addEventListener('click' , (e)=>{
//     console.log("body click");
// })

// hum event propogate ko stop bhi kar sakte hai: 
// use it -> event.stoppropogation:
// event propogate karne se ye jis element par hamn stop propogate lagaya hai 
// uske parent par nahi jata : 


//? event capturing :;
/*
it is the opposite of event bubbling in js . 
insted  of the event starting from the target element and then moving up through its ancestor , 
it begin from the top of the dom and capture down to the target element .
this process happen before the bubbling phase : 

 */

// green.addEventListener('click' , ()=>{
//     console.log('click green ');
// } , true);

// pink.addEventListener("click" , ()=>{
//     console.log('click pink');
// } , true);

// blue.addEventListener("click" , ()=>{
//     console.log('click blue');
// } , true);

// window.addEventListener('click' , ()=>{
//     console.log('click window');
// } , true)


// green.addEventListener('click' , ()=>{
//     console.log('click green ');
// } ,  {capture:true});

// pink.addEventListener("click" , ()=>{
//     console.log('click pink');
// } , {capture:true});

// blue.addEventListener("click" , ()=>{
//     console.log('click blue');
// } , {capture:true});

// window.addEventListener('click' , ()=>{
//     console.log('click window');
// } , {capture:true})


//? agar hame kisi bhi cheej ko ek hi baar click karna hai 
//? we use the once true : 
green.addEventListener('click' , ()=>{
    console.log('click green ');
} ,  {capture:true, once:true});

pink.addEventListener("click" , ()=>{
    console.log('click pink');
} , {capture:true , once:true});

blue.addEventListener("click" , ()=>{
    console.log('click blue');
} , {capture:true , once:true});

window.addEventListener('click' , ()=>{
    console.log('click window');
} , {capture:true , once : true})

// by default capture false hota hai that is event bubbling : 